package com.coforge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.MovieDao;
import com.coforge.entities.Movie;
@Service
public class MovieService {
	
	@Autowired
	MovieDao movieDao;
	
	public List<Movie> getAllMovies(){
		return movieDao.getAllMovies();
	}
	
	public Movie addMovie(Movie movie) {
		return movieDao.addMovie(movie);
	}
	
	public Movie getByMovieId(long movieId) {
		return movieDao.getByMovieId(movieId).orElseThrow(()->new RuntimeException());
	}
	
	public List<Movie> findByLanguage(String Language){
		return movieDao.findByLanguage(Language);
	}


}
