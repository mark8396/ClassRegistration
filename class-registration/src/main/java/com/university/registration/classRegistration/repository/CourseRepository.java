package com.university.registration.classRegistration.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.university.registration.classRegistration.model.Course;
import com.university.registration.classRegistration.model.CourseProfessor;

@Repository
public class CourseRepository {

	@Autowired
	private DynamoDBMapper dynamoDBMapper;
	
	public Course createCourse(Course course) {
		dynamoDBMapper.save(course);
		return course;
	}
	
	public CourseProfessor assignProfessorToCourse(CourseProfessor courseProfessor) {
		dynamoDBMapper.save(courseProfessor);
		return courseProfessor;
	}
	
	public Course findCourseByCourseId(String courseId) {
		Course course = new Course();
		course.setCourseid(courseId);
		course.setCourseSk(courseId);
		return dynamoDBMapper.load(course);
	}
	
}
