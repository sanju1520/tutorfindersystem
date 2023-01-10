package com.cg.tutor.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.tutor.entity.Booking;
import com.cg.tutor.exception.BookingDetailsNotFoundException;
import com.cg.tutor.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public List<Booking> getAllBookingDetails() throws BookingDetailsNotFoundException{
		List<Booking> bookingList=bookingRepository.findAll();
		if(bookingList==null) {
			throw new BookingDetailsNotFoundException("Booking details not found");
		}
		return bookingList;
		//return bookingRepository.findAll();
	}

	@Override
	public Booking saveBookingDetails(Booking booking) {
		Booking newBooking=bookingRepository.save(booking);
		return newBooking;
		
	}
	
}
