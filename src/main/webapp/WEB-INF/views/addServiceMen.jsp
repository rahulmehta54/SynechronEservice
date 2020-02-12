<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Syne E-service</title>
</head>
<body>
<h1>Please fill the below details to add new Service Man</h1>
<div class = "container">
<form action="addServiceMen" method = "post">

	<label for = "name"><b>Name :</b></label>
	<input type = "text" name = "name" placeholder= "Enter Name" required><br>
	<label for = "occupation"><b>Occupation :</b></label>
	<input type = "text" name = "occupation" placeholder= "Enter Occupation" required><br>
	<label for = "city"><b>City :</b></label>
	<input type = "text" name = "city" placeholder= "City" required><br>
	<label for = "mobileNo"><b>Mobile Number :</b></label>
	<input type = "text" name = "mobileNo" placeholder= "Enter Mobile Number" required><br>
	<label for = "serviceCharges"><b>Basic Service Charges :</b></label>
	<input type = "text" name = "serviceCharges" placeholder= "Enter Basic Service Charges" required><br>
	<button type="submit" onClick = "myFunction()">Add Service Man</button>
	</form>
</div>

<script>
function myFunction() {
    alert("Service Man added successfully!");
}

</script>

</body>
</html>