package com.university.registration.classRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.university.registration.classRegistration.model.Course;
import com.university.registration.classRegistration.model.CourseProfessor;
import com.university.registration.classRegistration.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Course createCourse(Course course) {
		
		courseRepository.createCourse(course);
		return course;
	}
	
	public CourseProfessor assignProfessorToCourse(String courseId, String professorId) {
		CourseProfessor courseProfessor = new CourseProfessor();
		courseProfessor.setCourseid(courseId);
		courseProfessor.setProfessorId(professorId);
		courseRepository.assignProfessorToCourse(courseProfessor);
		return courseProfessor;
	}
}
