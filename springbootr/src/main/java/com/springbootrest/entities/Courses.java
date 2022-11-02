package com.springbootrest.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class Courses {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private String description;
	
//	public Courses(long id, String title, String description) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.description = description;
//	}
//
//	public Courses() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	@Override
//	public String toString() {
//		return "Courses [id=" + id + ", title=" + title + ", description=" + description + "]";
////		return "Course [id=" + id + ", title=" + title + ", descripation=" + description + ", getId()=" + getId()
////		+ ", getTitle()=" + getTitle() + ", getDescripation()=" + getDescription() + ", getClass()=" + getClass()
////		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	
	
} 
