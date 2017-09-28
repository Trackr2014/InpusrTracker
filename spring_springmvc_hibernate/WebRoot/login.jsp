<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
<style> 
body{ text-align:center} 
.div{ margin:0 auto; width:800px; height:500px; border:1px solid #F00} 
/* css注释：为了观察效果设置宽度 边框 高度等样式 */ 
</style> 
  <body>
  <div class="div">
  <h1>用户登录</h1>
    <form action="/spring_springmvc_hibernate/user/index.do" method="post">
    	用户名：<input  type="text" name="name" >
    	密码：<input  type="password" name="password">
    	<input type="submit" value="提交" >
    </form>
    </div>
  </body>
</html>
