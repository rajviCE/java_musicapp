package com.javaproject.musicapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaproject.musicapp.entity.Genre;
import com.javaproject.musicapp.repository.GenreDao;

@Service
public class GenreServiceImp implements GenreService {
	@Autowired
	private GenreDao genredao;

	public List<Genre>getaGenre()
	{
		return genredao.findAll();
	}
	public Optional<Genre> getGenreById(int genreid)
	{
		return genredao.findById(genreid);
	}
	public void addGenre(Genre genre)
	{
		genredao.save(genre);
	}
	public void delete(int genreid)
	{
		genredao.deleteById(genreid);
	}

}
