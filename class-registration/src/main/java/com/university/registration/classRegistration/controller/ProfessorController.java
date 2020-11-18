package com.university.registration.classRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.registration.classRegistration.model.Professor;
import com.university.registration.classRegistration.service.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;
	
	@PostMapping("/create")
	public ResponseEntity<Professor> createProfessor(@RequestBody Professor professor) {
		professorService.createProfessor(professor);
		return new ResponseEntity<Professor>(professor, HttpStatus.OK);
	}
	
}
