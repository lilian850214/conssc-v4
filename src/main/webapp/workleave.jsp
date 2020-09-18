<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<% 
	String path=request.getContextPath();
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
<meta charset="UTF-8">
<base href="<%=basePath%>"/>

<title>Insert title here</title>
</head>
<body>
<h1>假期人工调整</h1>
<c:if test="${ sessionScope.flag=='pass'}">
<p>成功</p>
<p>${ sessionScope.result}</p>
</c:if>
<c:if test="${ sessionScope.flag=='failed'}">
<p>失败</p>
</c:if>
<form action="HRService" method="post">
姓名<input type="text" id="uid" name="pid" value=""><br>
<table>
<thead>
<tr>
<td>类型</td>
<td>余量</td>
<td>调整量</td>
</tr>
</thead>
<tbody>
<tr>
<td>年假</td>
<td ><input type="text"value="${sessionScope.data}" ></td>
<td><input type="text" name="annualleave" value=""></td>
</tr>
<tr>
<td>病假</td>
<td></td>
<td><input type="text" name="sickleave" value=""></td>
</tr>
<tr>
<td>事假</td>
<td></td>
<td><input type="text" name="personalleave" value=""></td>
</tr>
<tr>
<td>产假</td>
<td></td>
<td><input type="text" name="maternityleave" value=""></td>
</tr>
<tr>
<td>调休</td>
<td></td>
<td><input type="text" name="wxchangeleave" value=""></td>
</tr>
</tbody>
</table>
<input type="submit" value="提交">
</form>
<p id="res">here</p>
<script src="webjars/jquery/3.5.1/jquery.js"></script>
<script type="text/javascript">
$(function () {
	$("#uid").blur(function () {
		
		//发起ajax请求
		$.post(
				"HRService",       //请求地址
				{
				username:$("#uid").val(),//请求数据,req.getParameter("username")
				//methodName:"ff"
				},
				function(flag){     //回调函数
					
				
				})
	})
	
})

</script>

</body>
</html>