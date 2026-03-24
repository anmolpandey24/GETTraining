package com.coforge.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.dao.BookingDao;
import com.coforge.entities.Booking;

@Service
public class BookingService {
	
	@Autowired
	BookingDao bookingDao;
	

	public List<Booking> getAllBooking(){
		return bookingDao.getAllBooking();
	}
	
	public Booking addBooking(Booking booking) {
		return bookingDao.addBooking(booking);
	}
	
	public Booking getByBookingId(long bookingId) {
		return bookingDao.getByBookingId(bookingId).orElseThrow(()->new RuntimeException());
	}
	
	 public List<Booking> getAllBookingsByCustomerName(@PathVariable("customerName") String cname){
			return bookingDao.getAllBookingsByCustomerName(cname);
		}
	 
	 public List<Booking> getAllBookingsByNumberOfSeats(@PathVariable("seatcount") int seatcount){
	    	return bookingDao.getAllBookingsByNumberOfSeats(seatcount);
	    }
	 
	 public List<Booking> getAllBookingsByBookingDate(@PathVariable("bdate") LocalDate bookingDate){
	    	return bookingDao.getAllBookingsByBookingDate(bookingDate);
	    }
	 
	 public Booking getBookingByCnameAndCmobile(@PathVariable("cname")String cname,@PathVariable("cmobile")String cmobile) {
	    	return bookingDao.getBookingByCnameAndCmobile(cname,cmobile);
	    }



}
