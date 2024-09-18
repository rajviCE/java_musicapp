package com.javaproject.musicapp.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.musicapp.Service.TrackServiceImp;
import com.javaproject.musicapp.entity.Track;



@RestController
@RequestMapping("/api/Tracks")
public class Trackcontroller
{
	@Autowired
	private TrackServiceImp Trackservice;

	@GetMapping
	public List<Track>getaTrack()
	{
		return Trackservice.getaTrack();
	}

	@GetMapping("/{id}")
		public Track getTrackById(@PathVariable int id)
	{
		return Trackservice.getTrackById(id)
				.orElseThrow(()->new
				NoSuchElementException("Candidate not found with "
				+ "id"+id));
	}

	@PostMapping
	public Track addTrack(@RequestBody Track Track)
	 {
		Trackservice.addTrack(Track);

		return Track;
	 }


	@PutMapping("/{id}")
	public Track updateTrack(@PathVariable int id,
			@RequestBody Track updatedTrack )
	{
		Track track=Trackservice. getTrackById(id)
				.orElseThrow(()->new
				NoSuchElementException("Candidate not found with "
				+ "id"+id));

		track.setDesc(updatedTrack.getDesc());
		track.setGenre(updatedTrack.getGenre());
		track.settrackname(updatedTrack.gettrackname());
		track.setSinger(updatedTrack.getSinger());
		track.setFilepath(updatedTrack.getFilepath());
		Trackservice.addTrack(track);
		

		return track;

	}


	@DeleteMapping("/{id}")
	public  void delete(@PathVariable int id)
	{
		Trackservice.delete(id);
	}





}
