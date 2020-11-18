package com.university.registration.classRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.registration.classRegistration.model.Professor;
import com.university.registration.classRegistration.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;
	
	public Professor createProfessor(Professor professor) {
		professorRepository.createProfessor(professor);
		return professor;
	}
}
