package com.university.registration.classRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.university.registration.classRegistration.model.CourseProfessor;
import com.university.registration.classRegistration.model.Student;
import com.university.registration.classRegistration.model.CourseStudent;
import com.university.registration.classRegistration.repository.StudentRepository;
import com.university.registration.classRegistration.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		studentService.createStudent(student);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@PostMapping("/{id}/register/{courseId}")
	public ResponseEntity<CourseStudent> registerStudentForCourse(@PathVariable("id") String studentId,
													@PathVariable("courseId") String courseId) {
		return new ResponseEntity<CourseStudent>(studentService.registerStudentToCourse(studentId, courseId), HttpStatus.OK);
	}
}
