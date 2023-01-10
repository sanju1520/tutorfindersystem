package com.cg.tutor.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tutor.entity.Demo;
import com.cg.tutor.service.DemoService;

@RestController
public class DemoController {

	@Autowired 
    private DemoService demoService;
	
    @PostMapping("/demo/save") //adding data into database
    public ResponseEntity<Demo> addDemoDetails(@Valid @RequestBody Demo demo){
        Demo requestDemo= demoService.saveRequestedDemoDetails(demo);
        ResponseEntity<Demo> responseEntity=new ResponseEntity<>(requestDemo,HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("/demo/get") //retrieving data from database
    public List<Demo> fetchAllDemoDetails(){
        List<Demo> list=demoService.viewAllDemoDetails();
        return list;
    }
}
