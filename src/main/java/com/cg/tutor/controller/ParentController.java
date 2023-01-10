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

import com.cg.tutor.entity.Parent;
import com.cg.tutor.service.ParentService;


@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class ParentController {

	
	@Autowired
	private ParentService parentService;
	
	@GetMapping("/parent/all")
	public List<Parent> fetchAllParents() {
		List<Parent> list = parentService.getAllParents();
		return list;
	}
	

	@GetMapping("/parent/{id}")
	public ResponseEntity<Parent> fetchParentDetails(@PathVariable("id") int parentId) {
		Parent parent = parentService.getParentById(parentId);
		ResponseEntity<Parent> responseEntity = new ResponseEntity<>(parent, HttpStatus.OK);
		return responseEntity;
	}

	@PostMapping("/parent/save")
	public ResponseEntity<Parent> addTutor(@Valid@RequestBody Parent parent) {
		Parent newParent = parentService.saveParent(parent);
		ResponseEntity<Parent> responseEntity = new ResponseEntity<>(newParent, HttpStatus.CREATED);
		return responseEntity;
	}
	
	
	
}
