<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

	<div id="editEmployeeModal" >
		<div >
			<div class="modal-content">
				<form>
					<div class="modal-header">
						<h4 class="modal-title">Edit Service Provider</h4>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label>First Name</label> <input type="text" class="form-control" value="${userDetail.firstName}">
						</div>
						<div class="form-group">
							<label>Last Name</label> <input type="text" class="form-control" value="${userDetail.lastName}">
						</div>
						
						<div class="form-group">
							<label>City</label> <input type="text" class="form-control"
								value="${userDetail.city}">
						</div>
						
						<div class="form-group">
							<label>Category</label>
							<input type="text" class="form-control" value="${userDetail.category}">
						</div>
						
						<div class="form-group">
							<label>Mobile Number</label> <input type="text" class="form-control"
								value="${userDetail.mobileNo}">
						</div>
						<div class="form-group">
							<label>Rate For Service</label> <input type="text" class="form-control"
								value="${userDetail.rate}">
						</div>
					</div>
					<div class="modal-footer">
						 <input type="submit" class="btn btn-info" value="Save">
					</div>
				</form>
			</div>
		</div>
	</div>


</body>
</html>