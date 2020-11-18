package com.university.registration.classRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.registration.classRegistration.model.CourseStudent;
import com.university.registration.classRegistration.model.Student;
import com.university.registration.classRegistration.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student createStudent(Student student) {
		studentRepository.createStudent(student);
		return student;
	}
	
	public CourseStudent registerStudentToCourse(String studentId, String courseId) {
		CourseStudent courseStudent = new CourseStudent();
		courseStudent.setStudentId(studentId);
		courseStudent.setCourseId(courseId);
		studentRepository.registerStudentToCourse(courseStudent);
		return courseStudent;
	}
}
