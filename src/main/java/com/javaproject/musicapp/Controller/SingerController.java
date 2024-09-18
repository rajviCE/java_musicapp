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

import com.javaproject.musicapp.Service.SingerServiceImp;
import com.javaproject.musicapp.Service.TrackServiceImp;
import com.javaproject.musicapp.entity.Singer;



@RestController
@RequestMapping("/api/Singers")
public class SingerController
{
	@Autowired
	private SingerServiceImp Singerservice;

	@GetMapping
	public List<Singer>getaSinger()
	{
		return Singerservice.getSinger();
	}

	@GetMapping("/{id}")
		public Singer getSingerById(@PathVariable int id)
	{
		return Singerservice. getSingerById(id)
				.orElseThrow(()->new
				NoSuchElementException("Candidate not found with "
				+ "id"+id));
	}

	@PostMapping
	public Singer addSinger(@RequestBody Singer Singer)
	 {
		Singerservice.addSinger(Singer);

		return Singer;
	 }


	@PutMapping("/{id}")
	public Singer updateSinger(@PathVariable int id,
			@RequestBody Singer updatedSinger )
	{
		Singer sing=Singerservice.getSingerById(id)
				.orElseThrow(()->new
				NoSuchElementException("Candidate not found with "
				+ "id"+id));

		sing.setStrackname(updatedSinger.getStrackname());
		sing.setTracktime(updatedSinger.getTracktime());
		sing.setSingername(updatedSinger.getSingername());
		Singerservice.addSinger(sing);

		return sing;

	}


	@DeleteMapping("/{id}")
	public  void delete(@PathVariable int id)
	{
		Singerservice.delete(id);
	}


}
