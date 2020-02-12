<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="css/style.css" rel ="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Syne E-service</title>
</head>
<body>

<h2 align = "center"> Please fill the below details to create an account! </h2>
	<form action="signUp" method="post">
	<label for = "firstName"><b>First Name :</b></label>
	<input type = "text" name = "firstName" placeholder= "Enter First Name" required><br>
	<label for = "lastName"><b>Last Name :</b></label>
	<input type = "text" name = "lastName" placeholder= "Enter Last Name" required><br>
	<label for = "emailId"><b>Email ID :</b></label>
	<input type="email" name="emailId" placeholder="Enter Email ID" required><br>
	<label for = "mobileNo"><b>Mobile Number :</b></label>
	<input type = "text" name = "mobileNo" placeholder= "Enter Mobile Number" required><br>
	<label for = "address"><b>Address :</b></label>
	<input type = "text" name = "address" placeholder= "Enter Address" required><br>
	<label for = "pwd"><b>Password :</b></label>
	<input type="password" name="pwd" placeholder="Enter the Password" required><br>
	<input type="submit" value="Register">
	</form>

</body>
</html>