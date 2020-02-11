<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href = "css/style.css" rel="stylesheet">
<link href = "images/travel.jpg" rel='icon' >
<title>E- Service</title>
</head>
<body>
<h2>ADMIN LOGIN</h2>
<form:form action="validateAdminLogin" method="post">  

UserID:<input type="text" name="mailId"/><br/><br/>  
Password:<input type="password" name="password"/><br/><br/>  
<input type="hidden" name="role" value="admin">
<input type="submit" value="adminLogin"/>
<br>


</form:form>
</body>
</html>