package com.cg.tutor.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tutor.entity.Tutor;
import com.cg.tutor.exception.TutorNotFoundException;
import com.cg.tutor.service.TutorService;


@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class TutorController {

	
	
	@Autowired
	private TutorService tutorService;
	
	@GetMapping("/tutor/all")
	public List<Tutor> fetchAllTutors() {
		List<Tutor> list = tutorService.getAllTutors();
		return list;
	}
	

	@GetMapping("/tutor/{id}")
	public ResponseEntity<Tutor> fetchTutorDetails(@PathVariable("id") int tutorId) throws TutorNotFoundException {
		Tutor tutor = tutorService.getTutorById(tutorId);
		ResponseEntity<Tutor> responseEntity = new ResponseEntity<>(tutor, HttpStatus.OK);
		return responseEntity;
	}

	@PostMapping("/tutor/save")
	public ResponseEntity<Tutor> addTutor(@Valid @RequestBody Tutor tutor) {
		Tutor newTutor = tutorService.saveTutor(tutor);
		ResponseEntity<Tutor> responseEntity = new ResponseEntity<>(newTutor, HttpStatus.CREATED);
		return responseEntity;
	}
	
	@PostMapping("/tutor/acceptDemo")
	public ResponseEntity<Tutor> acceptDemo(@RequestBody Tutor tutor) {
		Tutor newTutor = tutorService.acceptDemo(tutor);
		ResponseEntity<Tutor> responseEntity = new ResponseEntity<>(newTutor, HttpStatus.CREATED);
		return responseEntity;
	}
	
	@PostMapping("/tutor/rejectDemo")
	public ResponseEntity<Tutor> rejectDemo(@RequestBody Tutor tutor) {
		Tutor newTutor = tutorService.rejectDemo(tutor);
		ResponseEntity<Tutor> responseEntity = new ResponseEntity<>(newTutor, HttpStatus.CREATED);
		return responseEntity;
	}
}
