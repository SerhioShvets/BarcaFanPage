<%@page import="controllers.ValidationServlet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		 <meta charset="UTF-8">
		 <title>Minimal sign up form</title>
		 <script src="https://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>
		 <link rel="stylesheet" href="css/style.css">
	</head>

	<body>
	  <form action="ValidationServlet" method="get">
		  <h1>Sign up</h1><br/>
		
		  <span class="input"></span>
		  <input type="text" name="name" placeholder="Full name" title="Format: Xx[space]Xx (e.g. Alex Cican)" autofocus autocomplete="off" required pattern="^\w+\s\w+$" />
		  <span class="input"></span>
		  
		  <input type="email" name="email" placeholder="Email address" required />
		  <span id="passwordMeter"></span> 
		  <input type="password" name="password" id="password" placeholder="Password" title="Password min 8 characters. At least one UPPERCASE and one lowercase letter" required pattern="(?=^.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$"/>
		  
		  <button type="submit" value="Sign Up" title="Submit form" class="icon-arrow-right"><span>Sign up</span></button>
	</form>
 		<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	    <script  src="js/index.js"></script>

</body>
</html>