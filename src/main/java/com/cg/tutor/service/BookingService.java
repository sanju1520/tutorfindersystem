package com.cg.tutor.service;

import java.util.List;

import com.cg.tutor.entity.Booking;

public interface BookingService{
	List<Booking> getAllBookingDetails();
	
	Booking saveBookingDetails(Booking booking);
}
