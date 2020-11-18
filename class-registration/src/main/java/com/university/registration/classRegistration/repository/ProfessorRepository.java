package com.university.registration.classRegistration.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.university.registration.classRegistration.model.Professor;

@Repository
public class ProfessorRepository {

	@Autowired
	private DynamoDBMapper dynamoDBMapper;
	
	public Professor createProfessor(Professor professor) {
		dynamoDBMapper.save(professor);
		return professor;
	}
	
}
