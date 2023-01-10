package com.cg.tutor.service;

import java.util.List;

import com.cg.tutor.entity.Demo;

public interface DemoService{
	List<Demo> viewAllDemoDetails();	
	
	Demo saveRequestedDemoDetails(Demo demo);
	
}
