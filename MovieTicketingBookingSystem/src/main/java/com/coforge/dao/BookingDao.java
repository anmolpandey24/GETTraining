package com.coforge.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.entities.Booking;
import com.coforge.repositories.BookingRepository;

@Repository
public class BookingDao {
	
	@Autowired
	BookingRepository bookingRepository;
	

	public List<Booking> getAllBooking(){
		return bookingRepository.findAll();
	}
	
	public Booking addBooking(Booking booking) {
		return bookingRepository.save(booking);
	}
	
	public Optional<Booking> getByBookingId(long bookingId) {
		return bookingRepository.findById(bookingId);
	}
	
	public List<Booking> getAllBookingsByCustomerName(String cname){
		return bookingRepository.getAllBookingsByCustomerName(cname);
	}
	
	public List<Booking> getAllBookingsByNumberOfSeats(@PathVariable("seatcount") int seatcount){
    	return bookingRepository.getAllBookingsByNumberOfSeats(seatcount);
    }
	
	 public List<Booking> getAllBookingsByBookingDate(@PathVariable("bdate") LocalDate bookingDate){
	    	return bookingRepository.getAllBookingsByBookingDate(bookingDate);
	    }
	 
	 public Booking getBookingByCnameAndCmobile(@PathVariable("cname")String cname,@PathVariable("cmobile")String cmobile) {
	    	return bookingRepository.getBookingByCnameAndCmobile(cname,cmobile);
	    }



}
