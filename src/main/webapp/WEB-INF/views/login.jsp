<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<title>E-Services</title>
</head>
<body>
	<div class="col-md-6">
		<form:form action="login" method="post">

			<div class="form group">
				<label for="">Email</label>

				<form:input path="email" cssClass="form-control" />

				<div class="form group">
					<label for="">Password</label>
					<form:input path="password" name="password" Class="form-control" />
				</div>

				<input class="btn btn-success" type="submit" value="Login">


				<div class="form group">
					<br> New user? <a href="register">Start here</a>
				</div>
			</div>
		</form:form>
		</div>
</body>
</html>