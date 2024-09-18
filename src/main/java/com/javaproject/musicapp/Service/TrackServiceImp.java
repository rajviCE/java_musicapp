package com.javaproject.musicapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaproject.musicapp.entity.Track;
import com.javaproject.musicapp.repository.TrackDao;

@Service
public class TrackServiceImp implements TrackService {
	@Autowired
	private TrackDao Trackdao;

	public List<Track>getaTrack()
	{
		return Trackdao.findAll();
	}
	public Optional<Track> getTrackById(int Trackid)
	{
		return Trackdao.findById(Trackid);
	}
	public void addTrack(Track Track)
	{
		Trackdao.save(Track);
	}
	public void delete(int Trackid)
	{
		Trackdao.deleteById(Trackid);
	}

}
