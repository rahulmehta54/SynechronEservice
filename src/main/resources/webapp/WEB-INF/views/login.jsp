<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
yoooooo

	<form:form action="login" method="post">
		
		<label>Email</label>
		<form:input path="email"/>
		<label>Pass</label>
		<form:input path="password"/>
		<label>role</label>
		<form:input path="role"/>
		

		<input type="submit" value=submit>
	</form:form>
</body>
</html>