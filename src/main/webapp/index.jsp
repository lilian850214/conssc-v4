<%@ page language="java"  import="java.util.*"  contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>



<!DOCTYPE html>
<html>
<%
	String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<head>
<meta charset="UTF-8">
<base href="<%=basePath%>">
<title>hello world</title>
</head>
<body>
	<h3>欢迎访问</h3>
<c:if test="${ sessionScope.flag=='failed'}">
<p>登陆失败，用户名或密码错误</p>
</c:if>
<c:remove var="flag" scope="session"/>
	<form action="userlogin" method="post">
		用户名：<input type="text" name="username" value=""><br> 
		密码：<input type="password" name="pwd" value=""><br> 
		<input type="submit" value="登录">
	</form>

</body>

</html>