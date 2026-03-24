package com.coforge.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long movieId;
	private String title;
	private String language;
	private double price;
	@OneToMany(mappedBy = "movie" ,cascade = CascadeType.ALL)
	private List<Booking> bookingList;
	public Movie(String title, String language, double price) {
		super();
		this.title = title;
		this.language = language;
		this.price = price;
	}
//	public void addMovie(Movie movie) {
//		this.bookingList.add(movie);
//		movie.bookingList.add(this);
//	}
//	
//	public void remove(Movie movie) {
//		this.bookingList.remove(movie);
//		movie.bookingList.remove(this);
//		
//	}

}
