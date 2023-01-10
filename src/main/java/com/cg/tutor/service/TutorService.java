package com.cg.tutor.service;

import java.util.List;

import com.cg.tutor.entity.Tutor;
import com.cg.tutor.exception.TutorNotFoundException;

public interface TutorService 
{

    public Tutor saveTutor(Tutor tutor);
	
	public Tutor getTutorById(int tutorId) throws TutorNotFoundException;
	
	public List<Tutor> getAllTutors();

	
	public Tutor acceptDemo(Tutor tutor);

	




	public  Tutor rejectDemo(Tutor tutor);

	

	
	


}