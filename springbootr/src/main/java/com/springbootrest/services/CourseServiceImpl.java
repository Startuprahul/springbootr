package com.springbootrest.services;

import java.util.List;


import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.dao.CourseDao;
import com.springbootrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired 
	private CourseDao courseDao;
//private List<Courses> list;
//private Courses c;


	List<Courses>list;
	
	public CourseServiceImpl() {
		
//
//		list =new ArrayList<>();
//		list.add(new Courses (145,"Java core course","this course contains basics of java"));
//		list.add(new Courses(1234,"spring boot course","creating rest api in springboot") );
		
	}
	
	
	@Override 
	public List<Courses> getCourses() {
		
		return courseDao.findAll();
	}



	@Override
	public Courses getCourse(long courseId) {
//		Courses c=null;
//	for(Courses course:list) 
//	{
//			if(course.getId()==courseId) 
//			{
//				c=course;
//			 
//			}
//		}
		return courseDao.getOne(courseId);
	}


	@Override
	public Courses addCourses(Courses courses) {
//		list.add(courses);
		courseDao.save(courses);
		return courses;
	}
 

	@Override
	public Courses updateCourses(Courses course) {
//		 list.forEach(e ->{
//			 if(e.getId()== course.getId()) {
//				 e.setTitle(course.getTitle());
//			 e.setDescription(course.getDescription());
//			 }
//		 });
		courseDao.save(course);
		return course;
	}


	@Override
	public void deleteCourse(long parseLong) {
	//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		Courses entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
	}

}
