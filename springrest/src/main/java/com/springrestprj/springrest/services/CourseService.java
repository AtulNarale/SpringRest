package com.springrestprj.springrest.services;

import java.util.List;

import com.springrestprj.springrest.entity.Course;


public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

}
