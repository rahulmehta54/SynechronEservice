<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href ="css/style.css" rel="stylesheet">

<title>Login Module</title>
</head>
<body>
<form:form action="validateAdminLogin" method="post">  

UserID:<input type="text" name="mailId"/><br/><br/>  
Password:<input type="password" name="password"/><br/><br/>  
<input type="hidden" name="role" value="user">
<input type="submit" value="login"/>
<br>
<a href="Register">SignUp</a>

</form:form>
</body>
</html>