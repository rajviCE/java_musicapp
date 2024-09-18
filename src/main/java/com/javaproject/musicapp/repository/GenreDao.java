package com.javaproject.musicapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaproject.musicapp.entity.Genre;
@Repository
public interface GenreDao extends JpaRepository<Genre,Integer> {

}
