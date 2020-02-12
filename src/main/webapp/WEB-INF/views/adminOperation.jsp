<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href = "css/style.css" rel="stylesheet">
<link href = "images/travel.jpg" rel='icon' >
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>E- Service</title>
</head>
<body>
<div class="container">

<div><h4>${success}</h4></div>
<h2>E-service Page</h2>
<h2>Admin Operations</h2>
<br>
<br>
<ul class="list-group">
<li class="list-group-item list-group-item-success"><a href="addService">Add Service</a> </li>

<li class="list-group-item list-group-item-primary"><a href="viewServices">View AllServices</a> </li>

</ul>

</div>
</body>
</html>