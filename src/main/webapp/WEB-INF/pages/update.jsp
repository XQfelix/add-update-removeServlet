<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/head.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${basePath }/student/doUpdate" method="post" >
		<input type="hidden" name="id" value="${stu.id }" /><br>
		学生姓名:<input name="name" value="${stu.name }"/><br>
		学生班级:<input name="bId" value="${stu.BId }"/><br>	
		学生性别:<label><input name="gerden" value="1" type="radio" <c:if test="${stu.gerden==1 }">checked="checked"</c:if> />男</label>
				<label><input name="gerden" value="0" type="radio" <c:if test="${stu.gerden==0 }">checked="checked"</c:if> />女</label>
			<input type="submit" />
	
	</form>
</body>
</html>