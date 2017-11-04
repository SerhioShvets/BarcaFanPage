<%@page import="controllers.ValidationServlet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Barca Fan Page</title>
	</head>
	<body>
	  	<form action="ValidationServlet" method="GET">
		         <input type="text" name="Login" value="Login"/>
		    <br/>
		    <br/>
		         <input type="password" name="Pass" value= "Password"/>
		   		 <input type="submit" value="Log in"/>
	    </form>
	    </body>
	</body>
</html>