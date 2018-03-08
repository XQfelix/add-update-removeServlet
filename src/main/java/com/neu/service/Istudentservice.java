package com.neu.service;

import java.util.List;

import bean.Student;

public interface Istudentservice {
	public List<Student> getStudents();
	public int add(Student student);
	public Student getStudentById(int id);
	public int update(Student student);
	public int del(int id);
}
