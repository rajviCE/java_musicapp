package com.javaproject.musicapp.Service;

import java.util.List;
import java.util.Optional;

import com.javaproject.musicapp.entity.Genre;

public interface GenreService
{

	List<Genre>getaGenre();
	Optional<Genre>  getGenreById(int genreid);
	 void addGenre(Genre genre);
	 void delete(int genreid);
}