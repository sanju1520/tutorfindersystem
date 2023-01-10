package com.cg.tutor.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.tutor.entity.Rating;
import com.cg.tutor.repository.RatingRepository;

@SpringBootTest

public class RatingServiceTest {
	
	@InjectMocks
	private RatingServiceImpl ratingService=new RatingServiceImpl();
	
	@Mock
	private RatingRepository ratingRepository;
	
	
	@Test
	void testAddRating() {
		Rating newrating=new Rating();
		
		Rating rating1=new Rating();
		rating1.setRateId(10);
		rating1.setRate(5);
		rating1.setComment("Excellent");
		newrating.getRateId();
		newrating.getRate();
		newrating.getComment();
		
		when(ratingRepository.save(rating1)).thenReturn(newrating);
		
		Rating ratings=ratingService.addRating(rating1);
		
		ratingService.addRating(ratings);
		
		
	}
	
	@Test
	void testViewAllRatings() {
		List<Rating> ratings=new ArrayList<>();
		
		Rating rating1=new Rating();
		rating1.setRateId(10);
		rating1.setRate(5);
		rating1.setComment("Excellent");
		
		Rating rating2=new Rating();
		rating2.setRateId(10);
		rating2.setRate(5);
		rating2.setComment("Excellent");
		
		Rating rating3=new Rating();
		rating3.setRateId(10);
		rating3.setRate(5);
		rating3.setComment("Excellent");
		
		ratings.add(rating1);
		ratings.add(rating2);
		ratings.add(rating3);
		
		when(ratingRepository.findAll()).thenReturn(ratings);
		
		List<Rating> ratingList=ratingService.viewAllRatings();
		
		assertEquals(ratings.size(),ratingList.size());
		

	}

}
