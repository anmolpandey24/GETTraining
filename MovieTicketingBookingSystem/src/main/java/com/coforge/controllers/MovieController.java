package com.coforge.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Movie;
import com.coforge.services.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@PostMapping("/")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.addMovie(movie);
	}
	@GetMapping("/{movieId}")
	public Movie getByMovieId(@PathVariable("movieId") long movieId) {
		return movieService.getByMovieId(movieId);
	}
	@GetMapping("/language/{language}")
	public List<Movie> findByLanguage( @PathVariable String language){
		return movieService.findByLanguage(language);
	}


}
