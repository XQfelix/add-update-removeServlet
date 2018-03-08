<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${basePath }/student/doAdd" method="post" >
		<input type="hidden" name="id"/><br>
		学生姓名:<input name="name"/><br>
		学生班级:<input name="bId"/><br>
		学生性别:<label><input name="gerden" value="1" type="radio"/>男</label>
				<label><input name="gerden" value="0" type="radio"/>女</label>
			<input type="submit" />
	
	</form>
</body>
</html>