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
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js">
</script>
<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<title>E-Services</title>
</head>
<body>

	<div align="center">
		<div class="col-md-6">
			<form:form action="register" method="post">
				<br>
				<h2 class="centerText blue">Register User</h2>
				<br>
				<br>

				<div class="form-group">
					<label class="align-left">Email:</label>
					<form:input path="email" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">First Name:</label>
					<form:input path="fname" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Last Name:</label>
					<form:input path="lname" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Mobile Number:</label>
					<form:input path="mob" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Password:</label>
					<form:input path="password" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Confirm Password:</label>
					<form:input path="cpassword" cssClass="form-control" />
				</div>

				<input class="btn btn-success" type="submit" value="Register">
			</form:form>
		</div>
	</div>
</body>
</html>