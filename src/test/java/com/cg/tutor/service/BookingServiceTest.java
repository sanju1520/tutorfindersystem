package com.cg.tutor.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.tutor.entity.Booking;
import com.cg.tutor.entity.Parent;
import com.cg.tutor.entity.Role;
import com.cg.tutor.entity.Tutor;
import com.cg.tutor.repository.BookingRepository;
import com.cg.tutor.service.BookingServiceImpl;

@SpringBootTest
public class BookingServiceTest {
	
	@InjectMocks
	private BookingServiceImpl bookingService=new BookingServiceImpl();
	@Mock
	private BookingRepository bookingRepository;
	
	@Test
	public void testGetAllBookingDetails() {
		List<Booking> bookings=new ArrayList<>();
		
		Role r1=new Role();
		r1.setRoleId(1);
		r1.setRoleName("Tutor");
		
		Role r2=new Role();
		r2.setRoleId(2);
		r2.setRoleName("Parent");
		
		
		Parent p1=new Parent();
		p1.setUserId(1);
		p1.setFirstName("Shweta");
		p1.setLastName("Kekade");
		p1.setUsername("shweta");
		p1.setUserPassword("shweta@123");
		p1.setEmail("shweta@gmail.com");
		p1.setMobileNo("8710293847");
		p1.setAddress("Mumbai");
		p1.setRole(r2);
		
		Parent p2=new Parent();
		p2.setUserId(2);
		p2.setFirstName("Sneha");
		p2.setLastName("Karne");
		p2.setUsername("sneha");
		p2.setUserPassword("sneha@1234");
		p2.setEmail("snehak@gmail.com");
		p2.setMobileNo("7091871812");
		p2.setAddress("Pune");
		p2.setRole(r2);
		
		Parent p3=new Parent();
		p3.setUserId(3);
		p3.setFirstName("Rushi");
		p3.setLastName("Mehta");
		p3.setUsername("rushi#02");
		p3.setUserPassword("rushi@2098");
		p3.setEmail("rushi@gmail.com");
		p3.setMobileNo("9156293640");
		p3.setAddress("Delhi");
		p3.setRole(r2);
		
		Tutor t1=new Tutor();
		t1.setUserId(1);
		t1.setFirstName("Raj");
		t1.setLastName("Kumar");
		t1.setUsername("raj12");
		t1.setUserPassword("raj@123");
		t1.setEmail("raj@gmail.com");
		t1.setMobileNo("8710297730");
		t1.setAddress("Mumbai");
		t1.setExperience(5);
		t1.setSubjectSpecialization("SQL");
		t1.setRole(r1);
		
		Tutor t2=new Tutor();
		t2.setUserId(2);
		t2.setFirstName("Kunal");
		t2.setLastName("Gupta");
		t2.setUsername("kunal");
		t2.setUserPassword("kunal@123");
		t2.setEmail("guptakunal@gmail.com");
		t2.setMobileNo("9811028340");
		t2.setAddress("Pune");
		t2.setExperience(8);
		t2.setSubjectSpecialization("Java");
		t2.setRole(r1);
		
		Tutor t3=new Tutor();
		t3.setUserId(3);
		t3.setFirstName("Komal");
		t3.setLastName("Shinde");
		t3.setUsername("komal");
		t3.setUserPassword("komals@27");
		t3.setEmail("komalshinde@gmail.com");
		t3.setMobileNo("9810128863");
		t3.setAddress("Delhi");
		t3.setExperience(8);
		t3.setSubjectSpecialization("HTML");
		t3.setRole(r1);
		
		
		Booking booking1=new Booking();
		booking1.setBookingId(1);
		booking1.setDateofBooking(LocalDate.of(2020, 10, 10));
		booking1.setParent(p1);
		booking1.setTutor(t1);
		
		Booking booking2=new Booking();
		booking2.setBookingId(2);
		booking2.setDateofBooking(LocalDate.of(2020, 12, 13));
		booking2.setParent(p2);
		booking2.setTutor(t2);
		
		Booking booking3=new Booking();
		booking3.setBookingId(3);
		booking3.setDateofBooking(LocalDate.of(2021, 07, 19));
		booking3.setParent(p1);
		booking3.setTutor(t2);
		
		Booking booking4=new Booking();
		booking4.setBookingId(4);
		booking4.setDateofBooking(LocalDate.of(2001, 07, 29));
		booking4.setParent(p3);
		booking4.setTutor(t3);
		
		Booking booking5=new Booking();
		booking5.setBookingId(5);
		booking5.setDateofBooking(LocalDate.of(2000, 01, 29));
		booking5.setParent(p3);
		booking5.setTutor(t1);
		
		Booking booking6=new Booking();
		booking6.setBookingId(6);
		booking6.setDateofBooking(LocalDate.of(2003, 12, 12));
		booking6.setParent(p2);
		booking6.setTutor(t1);
		
		bookings.add(booking1);
		bookings.add(booking2);
		bookings.add(booking3);
		bookings.add(booking4);
		bookings.add(booking5);
		bookings.add(booking6);
		
		when(bookingRepository.findAll()).thenReturn(bookings);
		List<Booking> bookingList=bookingService.getAllBookingDetails();
		assertEquals(bookings.size(),bookingList.size());
		
	}
	
	@Test
	public void testSaveAllBookingDetails() {
		
		Role r1=new Role();
		r1.setRoleId(1);
		r1.setRoleName("Tutor");
		
		Role r2=new Role();
		r2.setRoleId(2);
		r2.setRoleName("Parent");
		
		Parent p1=new Parent();
		p1.setUserId(1);
		p1.setFirstName("Shweta");
		p1.setLastName("Kekade");
		p1.setUsername("shweta");
		p1.setUserPassword("shweta@123");
		p1.setEmail("shweta@gmail.com");
		p1.setMobileNo("8710293847");
		p1.setAddress("Mumbai");
		p1.setRole(r2);
		
		Tutor t1=new Tutor();
		t1.setUserId(1);
		t1.setFirstName("Raj");
		t1.setLastName("Kumar");
		t1.setUsername("raj12");
		t1.setUserPassword("raj@123");
		t1.setEmail("raj@gmail.com");
		t1.setMobileNo("8710297730");
		t1.setAddress("Mumbai");
		t1.setExperience(5);
		t1.setSubjectSpecialization("SQL");
		t1.setRole(r1);
		
		Booking newBooking1=new Booking();
		newBooking1.setBookingId(1);
		newBooking1.setDateofBooking(LocalDate.of(2000, 11, 10));
		newBooking1.setParent(p1);
		newBooking1.setTutor(t1);
		
		//Booking newBooking2=new Booking();
		
		when(bookingRepository.save(newBooking1)).thenReturn(newBooking1);
		assertEquals(newBooking1, bookingService.saveBookingDetails(newBooking1));
	}
	
}
