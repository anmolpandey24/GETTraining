package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Movie;
import com.coforge.repositories.MovieRepository;
@Repository
public class MovieDao {
	
	
	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> getAllMovies(){
		return movieRepository.findAll();
	}
	
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public Optional<Movie> getByMovieId(long movieId) {
		return movieRepository.findById(movieId);
	}
	
	public List<Movie> findByLanguage(String language){
		return movieRepository.findByLanguage(language);
	}

}
