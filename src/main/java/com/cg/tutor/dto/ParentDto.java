package com.cg.tutor.dto;

import java.util.List;
import java.util.Set;

import com.cg.tutor.entity.Booking;
import com.cg.tutor.entity.Demo;
import com.cg.tutor.entity.Ebook;
import com.cg.tutor.entity.Rating;
import com.cg.tutor.entity.User;

public class ParentDto


{
  
	
	
	public class Parent extends User {

		
		private List<Rating> rating;

		
		private Set<Booking> bookings;

	
		private List<Demo> requestDemo;

		
		private List<Ebook> ebook;

		public List<Rating> getRating() {
			return rating;
		}

		public void setRating(List<Rating> rating) {
			this.rating = rating;
		}

		public Set<Booking> getBookings() {
			return bookings;
		}

		public void setBookings(Set<Booking> bookings) {
			this.bookings = bookings;
		}

		public List<Demo> getRequestDemo() {
			return requestDemo;
		}

		public void setRequestDemo(List<Demo> requestDemo) {
			this.requestDemo = requestDemo;
		}

		public List<Ebook> getEbook() {
			return ebook;
		}

		public void setEbook(List<Ebook> ebook) {
			this.ebook = ebook;
		}

	}

	
}
