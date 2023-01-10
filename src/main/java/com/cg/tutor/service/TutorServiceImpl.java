package com.cg.tutor.service;

import java.util.List;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tutor.entity.Role;
import com.cg.tutor.entity.Tutor;

import com.cg.tutor.exception.RoleNotFoundException;
import com.cg.tutor.exception.TutorNotFoundException;
import com.cg.tutor.repository.RoleRepository;
import com.cg.tutor.repository.TutorRepository;

@Service
public class TutorServiceImpl implements TutorService {

	
	@Autowired
	private TutorRepository tutorRepository;
	
	@Autowired
	private RoleRepository roleRepository;


	@Override
	public Tutor saveTutor(Tutor tutor) 
	{
		Optional<Role> optionalRole =roleRepository.findById(tutor.getRole().getRoleId());
		if(optionalRole.isEmpty()) {
		       throw new RoleNotFoundException("Role not existing with id: "+tutor.getRole().getRoleId());
				}
			    Role role= optionalRole.get();
			    tutor.setRole(role);
		Tutor newTutor = tutorRepository.save(tutor);
		return newTutor;
	}

	
	
	@Override
	public Tutor getTutorById(int tutorId) throws TutorNotFoundException {
		Optional<Tutor> optionalTutor =tutorRepository.findById(tutorId);
		if(optionalTutor.isEmpty()) {
       throw new TutorNotFoundException("Tutor not existing with id: "+tutorId);
		}
	    Tutor tutor= optionalTutor.get();
		return tutor;
	}
	
    

	
	
	@Override
	public List<Tutor> getAllTutors() {
		
		return tutorRepository.findAll();
	}





	@Override
	public Tutor acceptDemo(Tutor tutor) {
	
		return null;
	}



	@Override
	public Tutor rejectDemo(Tutor tutor) {
		
		return null;
	}



	



	
	
	
	

}
