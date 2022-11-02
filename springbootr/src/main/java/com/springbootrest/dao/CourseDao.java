package com.springbootrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrest.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Long> {

}
