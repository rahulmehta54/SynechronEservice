<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
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
<div class = "container">
<h1>Edit Service Man information</h1>
<form action="editServiceMen" method = "post">

<!-- 	<label for = "id"><b>ID: </b></label><br> -->
<!-- 	<label for = "name"><b>Name :</b></label> -->
<!-- 	<input type = "text" name = "name" value = "Deepesh" required><br> -->
<!-- 	<label for = "occupation"><b>Occupation :</b></label> -->
<!-- 	<input type = "text" name = "occupation"  required><br> -->
<!-- 	<label for = "city"><b>City :</b></label> -->
<!-- 	<input type = "text" name = "city"  required><br> -->
<!-- 	<label for = "mobileNo"><b>Mobile Number :</b></label> -->
<!-- 	<input type = "text" name = "mobileNo"  required><br> -->
<!-- 	<label for = "serviceCharges"><b>Basic Service Charges :</b></label> -->
<!-- 	<input type = "text" name = "serviceCharges"  required><br> -->

<c:forEach items="${serviceMenDetail}" var = "item">
	<label for = "id"><b>ID: </b></label>&nbsp;<span>${item.id}</span><br>
	<label for = "name"><b>Name :</b></label>
	<input type = "text" name = "name" value = "${item.name}" required><br>
	<label for = "occupation"><b>Occupation :</b></label>
	<input type = "text" name = "occupation" value = "${item.occupation}" required><br>
	<label for = "city"><b>City :</b></label>
	<input type = "text" name = "city" value="${item.city}" required><br>
	<label for = "mobileNo"><b>Mobile Number :</b></label>
	<input type = "text" name = "mobileNo" value="${item.mobileNo}" required><br>
	<label for = "serviceCharges"><b>Basic Service Charges :</b></label>
	<input type = "text" name = "serviceCharges" value = "${item.serviceCharges}" required><br>



</c:forEach>

<!-- 	<label for = "id">ID: </label> -->
<!-- 	<label for = "name"><b>Name :</b></label> -->
<!-- 	<input type = "text" name = "name"  value= "Deepesh" required><br> -->
<!-- 	<label for = "occupation"><b>Occupation :</b></label> -->
<%-- 	<input type = "text" name = "occupation" value ="${serviceMenDetail.occupation}"  required><br> --%>
<!-- 	<label for = "city"><b>City :</b></label> -->
<%-- 	<input type = "text" name = "city" value ="${serviceMenDetail.city}" required><br> --%>
<!-- 	<label for = "mobileNo"><b>Mobile Number :</b></label> -->
<%-- 	<input type = "text" name = "mobileNo" value ="${serviceMenDetail.mobileNo}" required><br> --%>
<!-- 	<label for = "serviceCharges"><b>Basic Service Charges :</b></label> -->
<%-- 	<input type = "text" name = "serviceCharges" value = "${serviceMenDetail.serviceCharges}" required><br> --%>


	<button type="submit" onClick = "myFunction()">Update Information</button>
	</form>
</div>


</body>
</html>