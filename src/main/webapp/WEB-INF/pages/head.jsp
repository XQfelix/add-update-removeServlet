<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	String url=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	if(request.getServerPort()==80){
		url=request.getScheme()+"://"+request.getServerName()+request.getContextPath();
	}else{
		
	}
	//将头文件放置到作用域中 使用pagecontext就可以
	pageContext.setAttribute("basePath", url);
	
%>