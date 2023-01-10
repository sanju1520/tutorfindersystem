package com.cg.tutor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.tutor.entity.Tutor;
@Repository
public interface TutorRepository extends JpaRepository<Tutor, Integer>
{
	
}
