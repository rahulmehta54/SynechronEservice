<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="css/horizontalbar.css" rel="stylesheet" type="text/css"></link>
<link href="css/all.min.css" rel="stylesheet" type="text/css"></link>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"></link>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body>

<div><h2>	Welcome User: ${name}!! </h2></div>


<form action="/searchProvider" method="post">
<div class="wrapper">
	<input type="text"  name="service" class="input"  placeholder="What Services are you looking for?">
	<input type="text" class="input" placeholder="Enter the Location" name="location">
	<input type="submit" class="searchbtn"><i class="fas fa-search"></i>
</div>
</form>

	


</body>
</html>