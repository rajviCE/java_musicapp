package com.javaproject.musicapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaproject.musicapp.entity.Track;
@Repository
public interface TrackDao extends JpaRepository<Track,Integer> {

}
