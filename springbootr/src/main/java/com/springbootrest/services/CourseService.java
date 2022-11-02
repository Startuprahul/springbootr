package com.springbootrest.services;

import java.util.List;


import com.springbootrest.entities.Courses;

public interface CourseService {
	
	public Courses getCourse(long courseId);

	public Courses addCourses(Courses courses);

	public List<Courses> getCourses();

	public Courses updateCourses(Courses course);

	public void deleteCourse(long parseLong);

}
