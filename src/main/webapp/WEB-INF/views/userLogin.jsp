<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix ="fmt"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="col-md-6">
	<form:form method="post" action="userLoginValidation">
	
	<div class="form-group">
		<label>User Name</label>
		<form:input path="userName" cssClass="form-control"/>   <!--  call setter method-->
	</div>
	<div class="form-group">
		<label>User Password</label>
		<form:input path="password" cssClass="form-control"/>   <!--  call setter method-->
	</div>
	<div>
		<input type="submit" value = "Login" class="btn btn-info">
	</div>	
</form:form>
</div>

</body>
</html>