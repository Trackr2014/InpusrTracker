<%@ page language="java" contentType="text/html; charset=UTF-8"  
pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Insert title here</title>  
<style> 
body{ text-align:center} 
.div{ margin:0 auto; width:800px; height:500px; border:1px solid #F00} 
/* css注释：为了观察效果设置宽度 边框 高度等样式 */ 
</style> 
<script type="text/javascript">  
function addUser(){  
    var form = document.forms[0];  
    form.action = "/spring_springmvc_hibernate/user/addUser.do";  
    form.method="post";  
    form.submit();  
}  
</script>  
</head>  
<body> 
<div class="div">  
<h1>添加用户</h1>  
<form action="" name="userForm"> 

    姓名：<input type="text" name="name"> 
    密码：<input type="text" name="password"> 
    时间：<input type="text" name="loginDate">  
    <input type="button" value="添加" onclick="addUser()">  
</form> 
</div> 
</body>  
</html>  