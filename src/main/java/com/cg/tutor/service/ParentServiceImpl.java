package com.cg.tutor.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tutor.entity.Parent;
import com.cg.tutor.entity.Role;

import com.cg.tutor.exception.ParentNotFoundException;
import com.cg.tutor.exception.RoleNotFoundException;

import com.cg.tutor.repository.ParentRepository;
import com.cg.tutor.repository.RoleRepository;


@Service
public class ParentServiceImpl implements ParentService
{	
	@Autowired
	private ParentRepository parentRepository;

	@Autowired
	private RoleRepository roleRepository;



	@Override
	public Parent saveParent(Parent parent) 
	{
		Optional<Role> optionalRole =roleRepository.findById(parent.getRole().getRoleId());
		if(optionalRole.isEmpty()) {
		       throw new RoleNotFoundException("Role not existing with id: "+parent.getRole().getRoleId());
				}
			    Role role= optionalRole.get();
			    parent.setRole(role);
		Parent newParent = parentRepository.save(parent);
		return newParent;
	}
	
	
	 	@Override
		public Parent getParentById(int parentId) {
			Optional<Parent> optionalParent =parentRepository.findById(parentId);
			if(optionalParent.isEmpty()) {
				throw new ParentNotFoundException("Parent not existing with id: "+parentId);
			}
		    Parent parent= optionalParent.get();
			return parent;
		}
	
	
	
	

	@Override
	public List<Parent> getAllParents() {
		
		return parentRepository.findAll();
	}



}
