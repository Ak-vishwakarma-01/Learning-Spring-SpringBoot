package com.ankit.springbootapp._springbootappdemo;

import org.springframework.stereotype.Component;

@Component // it will create an object for you and also push into the container using spring ocntainer
public class Student {
	String studentName="Ankit";
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}