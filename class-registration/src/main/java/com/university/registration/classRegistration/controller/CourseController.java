package com.university.registration.classRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.registration.classRegistration.model.Course;
import com.university.registration.classRegistration.model.CourseProfessor;
import com.university.registration.classRegistration.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	
	
	@PostMapping("/create")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) throws Exception{
		courseService.createCourse(course);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
	
	@PostMapping("/{id}/assignProfessor/{professorId}")
	public ResponseEntity<CourseProfessor> assignProfessorToCourse(@PathVariable("id") String courseId,
													@PathVariable("professorId") String professorId) throws Exception{
		return new ResponseEntity<CourseProfessor>(
				courseService.assignProfessorToCourse(courseId, professorId), HttpStatus.OK);
	}
}
