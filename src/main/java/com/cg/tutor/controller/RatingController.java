package com.cg.tutor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tutor.entity.Rating;
import com.cg.tutor.service.RatingService;

@RestController
public class RatingController {
	@Autowired
    private RatingService ratingService;

    @PostMapping("/rating/save") //adding data into database
    public ResponseEntity<Rating> saveRating (@RequestBody Rating rating){
        Rating newTrainee=ratingService.addRating(rating);
        ResponseEntity<Rating> responseEntity=new ResponseEntity<>(newTrainee,HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("/rating/all") //retrieving data from database
    public List<Rating>fetchAllRatings(){
        List<Rating> list=ratingService.viewAllRatings();
        return list;
    }
}
