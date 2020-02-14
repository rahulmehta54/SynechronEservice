<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="css/all.min.css" rel="stylesheet" type="text/css"></link>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"></link>
<link href="css/tooplate-style.css" rel="stylesheet" type="text/css"></link>
<link href="css/crudadminpage.css" rel="stylesheet" type="text/css"></link>
<script src="js/admincrud.js"></script>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body>

	<div>
		<h2>Welcome Admin: ${name}!!</h2>
		<h3>${succesfull}</h3>
	</div>
    <div class="container">
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-6">
						<h3>
							<b>Manage Service Provides</b>
						</h3>
					</div>
					<div class="col-sm-6">
						<a href="/addEmployeeModal" class="btn btn-success"
							data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add
								Service Provider Details</span></a> <!-- <a href="#deleteEmployeeModal"
							class="btn btn-danger" data-toggle="modal"><i
							class="material-icons">&#xE15C;</i> <span>Delete</span></a> -->
					</div>
				</div>
			</div>
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>Name</th>
						<th>City</th>
						<th>Category</th>
						<th>Mobile No</th>
						<th>Rate of The Service</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="serviceProvider" items="${serviceproviderList}">
						<tr>
							
							<td>${ serviceProvider.firstName}</td>
							<td>${ serviceProvider.city}</td>
							<td>${ serviceProvider.category}</td>
							<td>${ serviceProvider.mobileNo}</td>
							<td>${ serviceProvider.rate}</td>
							<td><a href="/editEmployeeModal/${serviceProvider.serviceId}" class="edit"
								data-toggle="modal"><i class="material-icons"
									data-toggle="tooltip" title="Edit">&#xE254;</i></a> 
									<a href="/deleteEmployeeModal/${serviceProvider.serviceId}" class="delete" data-toggle="modal"><i
									class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
							</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>





</body>
</html>