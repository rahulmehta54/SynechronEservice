<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

	<div class="editEmployeeModal empclass" >
		<div>
			<div class="modal-content">
				<form:form method="post" action="/${url}">
					<div class="modal-header">
						<h4 class="modal-title">Edit Service Provider</h4>
					</div>
					<div class="modal-body">
					
					<form:input type="text"  path="serviceId" hidden="hidden"/>
					   
					   <div class="form-group">
							<label>First Name</label> <form:input path="firstName" type="text" class="form-control" />
						</div>
						
						<div class="form-group">
							<label>Last Name</label> <form:input path="lastName" type="text" class="form-control" />
						</div>
						
						<div class="form-group">
							<label>City</label> <form:input path="city" type="text" class="form-control"/>
						</div>
						
						<div class="form-group">
							<label>Category</label>
							<form:input path="category"  type="text" class="form-control" />
						</div>
						
						<div class="form-group">
							<label>Mobile Number</label> <form:input path="mobileNo"  type="text" class="form-control"
								/>
						</div>
						<div class="form-group">
							<label>Rate For Service</label> <form:input path="rate" type="text" class="form-control"
								/>
						</div>
					</div>
					<div class="modal-footer">
						 <input type="submit" class="btn btn-info" value="${save}">
					</div>
					
				</form:form>
			</div>
		</div>
	</div>


</body>
</html>