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

	<form:form action="login" method="post">
		
				<label>Email</label>
		<form:input path="email"/>
		<label>Pass</label>
		<form:input path="password"/>
		<form:radiobutton path="role" value="user"/>user 
<form:radiobutton path="role" value="admin"/>admin 
		
		<input type="submit" value=submit>
	</form:form>
</body>
</html>