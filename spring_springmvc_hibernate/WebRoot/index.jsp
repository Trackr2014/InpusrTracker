<%@ page language="java" contentType="text/html; charset=UTF-8"  
pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>
<%
    String path = request.getContextPath();
%>
<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Insert title here</title> 
<style> 
body{ text-align:center} 
.div{ margin:0 auto; width:800px; height:500px; border:1px solid #F00} 
/* css注释：为了观察效果设置宽度 边框 高度等样式 */ 
.t{ margin:0 auto; width:600px; height:300px; border:1px solid #F00} 

</style> 

</head>  
<body> 
<div class="div">   
    <h1><a href="/spring_springmvc_hibernate/user/toaddUser.do">添加用户</a></h1>  
    <table border="1" class="t">  
        <tbody>  
        <tr>  
            <th>姓名</th>  
            <th>密码</th>  
            <th>登录时间</th>
            <th>操作</th>    
        </tr>  
        <c:if test="${!empty userList }">  
            <c:forEach items="${userList}" var="user">  
                <tr>  
                	<td>${user.name }</td> 
                    <td>${user.password }</td>  
                    <td>${user.loginDate }</td>  
                    <td>  
                        <a href="/spring_springmvc_hibernate/user/getUser.do?id=${user.id }">编辑</a>  
                        <a href="/spring_springmvc_hibernate/user/delUser.do?id=${user.id }">删除</a>  
                    </td>  
                </tr>               
            </c:forEach>  
        </c:if>  
    </tbody> 
   </div>   
</table>  
</body>  
</html>  