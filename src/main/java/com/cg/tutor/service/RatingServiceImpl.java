package com.cg.tutor.service;

 

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.cg.tutor.entity.Rating;
import com.cg.tutor.repository.RatingRepository;

 

@Service
public class RatingServiceImpl implements RatingService{
    @Autowired
    private RatingRepository ratingRepository;

 

    @Override
    public Rating addRating(Rating rating) {
        Rating newRating=ratingRepository.save(rating);
        return newRating;
    }

 

    @Override
    public List<Rating> viewAllRatings() {
        List<Rating> ratings=ratingRepository.findAll();
        return ratings;
    }

 

}