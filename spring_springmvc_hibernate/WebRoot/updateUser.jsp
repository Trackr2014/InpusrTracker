<%@ page language="java" contentType="text/html; charset=UTF-8"  
pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>
<%
String path = request.getContextPath();
%>  
<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.min.js"></script>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Insert title here</title>
<style> 
body{ text-align:center} 
.div{ margin:0 auto; width:800px; height:500px; border:1px solid #F00} 
/* css注释：为了观察效果设置宽度 边框 高度等样式 */ 
</style>   
</head>  
<body> 
<div class="div">   
<h1>编辑用户</h1>  
<form action="/spring_springmvc_hibernate/user/updateUser.do" name="userForm" method="post">  
  <input type="hidden" name="id" value="${user.id }">  
    姓名：<input type="text" name="name" value="${user.name }">  
    密码：<input type="text" name="password" value="${user.password }">  
    时间：<input type="text" name="loginDate" value="${user.loginDate }"> 
    <input type="submit" value="编辑" >  
</form>
</div>    
</body>  
</html> 