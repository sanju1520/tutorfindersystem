package com.cg.tutor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tutor.entity.Demo;
import com.cg.tutor.exception.DetailsNotFoundException;
import com.cg.tutor.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService{

	@Autowired
    private DemoRepository demoRepository;
	
    @Override
    public List<Demo> viewAllDemoDetails()  throws DetailsNotFoundException{

    	List<Demo> demoList=demoRepository.findAll();
        if(demoList==null) {
            throw new DetailsNotFoundException("details not found");
        }
        return demoRepository.findAll();
    }
    @Override
    public Demo saveRequestedDemoDetails(Demo demo) {
        Demo requestDemo=demoRepository.save(demo);
        return requestDemo;
    }

}
