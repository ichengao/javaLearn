<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
    
    <form method="post" action="login.do">
    	username <input type="text" name="username"><br>
    	password <input type="password" name="password"><br>
    	<input type="text" name="vcode" />
    	<img src="code" onclick="this.src='code?'+Math.random()"><br>
    	<input type="submit" value="login">
    	
    </form>
    
  </body>
</html>
