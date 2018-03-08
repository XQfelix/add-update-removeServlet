package com.neu.dao;

import java.util.List;

import bean.Student;

public interface IstudentDao {
	public List<Student> getStudents();
	public int add(Student student);
	public Student getStudentById(int id);
	public int update(Student student);
	public int del(int id);
	
}
