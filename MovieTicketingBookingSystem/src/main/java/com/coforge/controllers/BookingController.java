package com.coforge.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Booking;
import com.coforge.services.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
    @GetMapping("/")
	public List<Booking> getAllBooking(){
		return bookingService.getAllBooking();
	}
	
    @PostMapping("/")
	public Booking addBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}
	
    @GetMapping("/{bookingId}")
	public Booking getByBookingId(@PathVariable("bookingId") long bookingId) {
		return bookingService.getByBookingId(bookingId);
	}
    
    @GetMapping("/customername/{customerName}")
    public List<Booking> getAllBookingsByCustomerName(@PathVariable("customerName") String cname){
		return bookingService.getAllBookingsByCustomerName(cname);
	}
    
    @GetMapping("/seatcount/{seatcount}")
    public List<Booking> getAllBookingsByNumberOfSeats(@PathVariable("seatcount") int seatcount){
    	return bookingService.getAllBookingsByNumberOfSeats(seatcount);
    }
    
    @GetMapping("/bookingDate/{bdate}")
    public List<Booking> getAllBookingsByBookingDate(@PathVariable("bdate") LocalDate bookingDate){
    	return bookingService.getAllBookingsByBookingDate(bookingDate);
    }
    
    public Booking getBookingByCnameAndCmobile(@PathVariable("cname")String cname,@PathVariable("cmobile")String cmobile) {
    	return bookingService.getBookingByCnameAndCmobile(cname,cmobile);
    }
    
    

}
