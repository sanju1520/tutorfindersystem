package com.cg.tutor.dto;


import java.util.List;
import java.util.Set;

import com.cg.tutor.entity.Booking;
import com.cg.tutor.entity.Demo;
import com.cg.tutor.entity.User;

public class TutorDto 
{
	public class Tutor extends User
	{

	    
	     private int experience;

	    
	     private String subjectSpecialization;
	     
	    
	     private List<Demo> viewDemo;
	     
	    
	     private Set<Booking> bookings;

		public int getExperience() {
			return experience;
		}

		public void setExperience(int experience) {
			this.experience = experience;
		}

		public String getSubjectSpecialization() {
			return subjectSpecialization;
		}

		public void setSubjectSpecialization(String subjectSpecialization) {
			this.subjectSpecialization = subjectSpecialization;
		}

		public List<Demo> getViewDemo() {
			return viewDemo;
		}

		public void setViewDemo(List<Demo> viewDemo) {
			this.viewDemo = viewDemo;
		}

		public Set<Booking> getBookings() {
			return bookings;
		}

		public void setBookings(Set<Booking> bookings) {
			this.bookings = bookings;
		}

		
	}

}
