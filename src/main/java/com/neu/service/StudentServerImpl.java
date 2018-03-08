package com.neu.service;

import java.util.List;

import com.neu.dao.IstudentDao;
import com.neu.dao.StudentDaoImpl;

import bean.Student;

public class StudentServerImpl implements Istudentservice{
	IstudentDao dao = new StudentDaoImpl();
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return dao.getStudents();
	}

	@Override
	public int add(Student student) {
		// TODO Auto-generated method stub
		return dao.add(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.getStudentById(id);
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return dao.update(student);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return dao.del(id);
	}

}
