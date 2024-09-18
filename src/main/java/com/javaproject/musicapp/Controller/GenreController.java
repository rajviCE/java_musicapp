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

import com.javaproject.musicapp.Service.GenreServiceImp;

import com.javaproject.musicapp.entity.Genre;






@RestController
@RequestMapping("/api/Genres")
public class GenreController
{
	@Autowired
	private GenreServiceImp genreservice;

	@GetMapping
	public List<Genre>getaGenre()
	{
		return genreservice.getaGenre();
	}

	@GetMapping("/{id}")
		public Genre getGenreById(@PathVariable int id)
	{
		return genreservice. getGenreById(id)
				.orElseThrow(()->new
				NoSuchElementException("Candidate not found with "
				+ "id"+id));
	}

	@PostMapping
	public Genre addGenre(@RequestBody Genre genre)
	 {
		genreservice.addGenre(genre);

		return genre;
	 }


	@PutMapping("/{id}")
	public Genre updateGenre(@PathVariable int id,
			@RequestBody Genre updatedGenre )
	{
		Genre gen=genreservice. getGenreById(id)
				.orElseThrow(()->new
				NoSuchElementException("Candidate not found with "
				+ "id"+id));

		gen.setg_tracks(updatedGenre.getg_tracks());
		gen.setGenrename(updatedGenre.getGenrename());
		genreservice.addGenre(gen);

		return gen;

	}


	@DeleteMapping("/{id}")
	public  void delete(@PathVariable int id)
	{
		genreservice.delete(id);
	}
}
