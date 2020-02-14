<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href ="css/loginUI.css" rel="stylesheet">

<title>Login Module</title>
</head>
<body>
<div class="container">
<p style="text-align:center;color:#FF338A;"><b>USER LOGIN</b></p>
<div>
<h3>${success}</h3>
</div>

<form:form action="validateUserLogin" method="post">  
 <div class="row">
<div class="col">


<input type="text" name="mailId" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="hidden" name="role" value="user">
        <input type="submit" value="Login">
</div>
</div>

</form:form>
</div>
<div>
 <a href="Register" style="color:blue" class="btn" style="text-align:center">Sign up</a>
 </div>
 </div>
</div>

</body>
</html>