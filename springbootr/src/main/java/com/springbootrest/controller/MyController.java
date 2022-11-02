 package com.springbootrest.controller;

import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.entities.Courses;
import com.springbootrest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
   @GetMapping("/home")
	public String Home() {
		
		
		return"Welcome to courses application";
	}
   
 //get the courses
   @GetMapping("/courses")
   public List<Courses> getCourses()
   {
	   
	   return this.courseService.getCourses();
   }
   //get single course-------------------------
   @GetMapping("/courses/{courseId}")
   public Courses getCourse(@PathVariable String courseId) 
   {
	   return this.courseService.getCourse(Long.parseLong(courseId));
   }
   //post the value--------------------------------
   @PostMapping("/courses")
   public Courses addCourse(@RequestBody Courses course) 
   {
	   return this.courseService.addCourses(course);
   }
   //put or update the value----------
   @PutMapping("/courses/{courseId}")
   public Courses updateCourse(@RequestBody Courses course) 
   {
   return this.courseService.updateCourses(course);	
   }
   //delete the course-------
   @DeleteMapping("/courses/{courseId}")
   public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId ){
	   try {
		this.courseService.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
   }
}
