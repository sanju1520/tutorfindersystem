package com.cg.tutor.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.tutor.entity.Booking;
import com.cg.tutor.service.BookingService;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class BookingController {
	@Autowired
	private BookingService bookingService; 
	
	
	@PostMapping("/booking/savebookings") //adding data into database
	public ResponseEntity<Booking> addNewBooking(@RequestBody Booking booking) {
		Booking newBooking = bookingService.saveBookingDetails(booking);
		ResponseEntity<Booking> responseEntity = new ResponseEntity<>(newBooking, HttpStatus.CREATED);
		return responseEntity;
		
	}
	
	@GetMapping("/booking/viewAllBookingDetails") //retrieving data from database
	public List<Booking> fetchAllBookingDetails() {
		List<Booking> list = bookingService.getAllBookingDetails();
		return list;
	}
}
