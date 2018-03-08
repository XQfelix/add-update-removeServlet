<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/head.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin:0;
		padding:0;
	}
	
	#tb{
		border-collapse: collapse;
		height:500px;
		width:600px;
		text-align: center;
	}
	
	#tb th,td{
		border:2px solid #000;
	}
</style>
</head>
<body>  

${basePath }
	<a href="${basePath }/student/goAdd">添加学生</a>
  	<table id="tb">
  		<thead>
  			<tr>
  				<th>学生编号</th>
  				<th>学生姓名</th>
  				<th>学生班级</th>
  				<th>学生性别</th>
  				<th>修改</th>
  				<th>删除</th>
  			</tr>
  		</thead>
  		<tbody>
  			<c:forEach var="stu" items="${list }">
  				<tr>
  				<td>${stu.id }</td>
  				<td>${stu.name }</td>
  				<td>${stu.BId }</td>
  				<td>${stu.gerden }</td>
  				<td><a href="${basePath }/student/goUpdate?id=${stu.id}">修改</a></td>
  				<td><a href="${basePath }/student/del?id=${stu.id}">删除</a></td>
  				</tr>
  			</c:forEach>
  			
  		</tbody>
  		
  	
  	</table>
</body>
</html>