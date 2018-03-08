package com.neu.dao;

import java.util.List;

import bean.Student;
import util.JdbcUtil;

public class StudentDaoImpl implements IstudentDao{

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return JdbcUtil.executeQuery("select id,name,b_id,gerden from student", Student.class, null);
	}

	@Override
	public int add(Student student) {
		// TODO Auto-generated method stub
		return JdbcUtil.executeUpdate("insert into student(name,b_id,gerden) values(?,?,?)", student.getName(),student.getBId(),student.getGerden());
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return JdbcUtil.QueryOne("select id,name,b_id,gerden from student where id=?", Student.class, id);
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return JdbcUtil.executeUpdate("update student set name=?,b_id=?,gerden=? where id=?", student.getName(),student.getBId(),student.getGerden(),student.getId());
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return JdbcUtil.executeUpdate("delete from student where id=?", id);
	}

}
