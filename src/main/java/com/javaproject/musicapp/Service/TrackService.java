package com.javaproject.musicapp.Service;

import java.util.List;
import java.util.Optional;

import com.javaproject.musicapp.entity.Track;

public interface TrackService
{

	List<Track>getaTrack();
	Optional<Track>getTrackById(int Trackid);
	 void addTrack(Track Track);
	 void delete(int Trackid);
}