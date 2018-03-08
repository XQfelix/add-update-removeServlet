package com.neu.coll;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.service.Istudentservice;
import com.neu.service.StudentServerImpl;

import bean.Student;

@WebServlet("/student/*")
public class StudentServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sub = "/Web0307youhua/student/";
		String uri = request.getRequestURI();
		String path = uri.substring(sub.length());
		
		
		//通过反射,拿到方法名然后调用方法
		try {
		Method method = this.getClass().getMethod(path,HttpServletRequest.class,HttpServletResponse.class);
		method.invoke(this, request,response);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void students(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		Istudentservice service = new StudentServerImpl();
		List<Student> students = service.getStudents();
		request.setAttribute("list", students);
		request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request, response);
		
	}
	
	public void  goAdd(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		//将页面转发到首页
		request.getRequestDispatcher("/WEB-INF/pages/add.jsp").forward(request, response);
						
	}
	
	public void doAdd(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String name = request.getParameter("name");
		int bId = Integer.parseInt(request.getParameter("bId"));
		int gerden = Integer.parseInt(request.getParameter("gerden"));
		Student student = new Student();
		student.setName(name);
		student.setBId(bId);
		student.setGerden(gerden);
		Istudentservice service = new StudentServerImpl();
		service.add(student);
		response.sendRedirect("students");
//		response.sendRedirect("/Web0307youhua/student/students");
	}
	
	public void goUpdate(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		Istudentservice service = new StudentServerImpl();
		Student student  = service.getStudentById(id);
		request.setAttribute("stu", student);
		request.getRequestDispatcher("/WEB-INF/pages/update.jsp").forward(request, response);			
	}
	
	public void doUpdate(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String name = request.getParameter("name");
		int bId = Integer.parseInt(request.getParameter("bId"));
		int gerden = Integer.parseInt(request.getParameter("gerden"));
		int id = Integer.parseInt(request.getParameter("id"));
		
		Student student = new Student();
		student.setName(name);
		student.setBId(bId);
		student.setGerden(gerden);
		student.setId(id);
		
		Istudentservice service = new StudentServerImpl();
		service.update(student);
		
		response.sendRedirect("/Web0307youhua/student/students");		
	}
	
	public void del(HttpServletRequest request,HttpServletResponse response) throws IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		Istudentservice service = new StudentServerImpl();
		service.del(id);
		response.sendRedirect("students");
		
	}
	
}
