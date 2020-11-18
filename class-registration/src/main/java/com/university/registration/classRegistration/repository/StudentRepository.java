package com.university.registration.classRegistration.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.university.registration.classRegistration.model.Course;
import com.university.registration.classRegistration.model.CourseProfessor;
import com.university.registration.classRegistration.model.Student;
import com.university.registration.classRegistration.model.CourseStudent;

@Repository
public class StudentRepository {

	@Autowired
	private DynamoDBMapper dynamoDBMapper;
	
	public Student createStudent(Student student) {
		dynamoDBMapper.save(student);
		return student;
	}
	
	public CourseStudent registerStudentToCourse(CourseStudent studentCourse) {
		dynamoDBMapper.save(studentCourse);
		return studentCourse;
	}

}
