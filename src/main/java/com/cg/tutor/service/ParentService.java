package com.cg.tutor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.tutor.entity.Parent;

@Service
public interface ParentService {

	

   Parent saveParent(Parent parent);
	
	Parent getParentById(int parentId);
	
	List<Parent> getAllParents();

}