package com.coforge.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@NamedQuery(name="Booking.findByMovieTitle",query="select b from Booking where b.movie.title=:")
@NamedQuery(name="Booking.findByTotalAmount",query="select b from Booking where totalAmount=:ta")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	private long bookingId;
	public Booking(String customerName, String customerMobileNum, int seatCount, LocalDate bookingDate, String showTime,
			double totalAmount, Movie movie) {
		super();
		this.customerName = customerName;
		this.customerMobileNum = customerMobileNum;
		this.seatCount = seatCount;
		this.bookingDate = bookingDate;
		this.showTime = showTime;
		this.totalAmount = totalAmount;
		this.movie = movie;
	}
	private String customerName;
	private String customerMobileNum;
	private int seatCount;
	private LocalDate bookingDate;
	private String showTime;
	private double totalAmount;
	@ManyToOne
	@JoinColumn(name="movieId")
	private Movie movie;

}
