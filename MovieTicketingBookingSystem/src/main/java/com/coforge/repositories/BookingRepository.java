package com.coforge.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.coforge.entities.Booking;
import com.coforge.entities.Movie;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	
	public List<Booking> findByShowTime(@Param("showTime")String showTime);
	
	@Query(name="select * from booking where customer_name=:cname",nativeQuery = true)
	public List<Booking> getAllBookingsByCustomerName(@Param("cname")String cname);
	
	@Query(name="select * from booking where seat_count=:seatcount",nativeQuery = true)
	public List<Booking> getAllBookingsByNumberOfSeats(@Param("seatcount") int seatcount);
	
	@Query("select b from Booking b where bookingDate=:bdate")
	public List<Booking> getAllBookingsByBookingDate(@Param("bdate") LocalDate bookingDate);
	
	
	@Query("select b from Booking b where customerName=:cname and customerMobile=:cmobile")
	public Booking getBookingByCnameAndCmobile(@Param("cname")String cname,@Param("cmobile")String cmobile);
	
	@Query(name="Booking.findByMovieTitle")
	public Movie findBookingByMovieTitle(String title);
	
	@Query(name="Booking.findByTotalAmount")
	public List<Booking> findBookingByTotalAmount(double ta);
	


}
