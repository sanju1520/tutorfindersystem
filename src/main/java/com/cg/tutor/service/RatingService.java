package com.cg.tutor.service;

import java.util.List;

import com.cg.tutor.entity.Rating;

public interface RatingService {
	 public Rating addRating(Rating rating);

	 public List<Rating> viewAllRatings();
}
