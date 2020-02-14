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
<body id ="addservice">

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
<ul class="navbar-nav">
    <li style="color:white" class="nav-item active">Syne E-service</li>  	
</ul>
</nav>
   
   <br>


<div class = "container">

<div class="row justify-content-center" >
	<div class = "col-md-8">
		<div class = "card">
			<div class = "card-header"><b>Fill The Below Details To Add New Service Man</b></div>
			<div class = "card-body">
				<form name = "addservice" action="addServiceMen" method = "post" >
					<div class = "form-group row">
						<div class= "col-md-4 col-form-label text-md-right">
							<label for = "name"><b>Name :</b></label>
						</div>
						<div class = "col-md-6">
							<input type = "text" name = "name" placeholder= "Enter Name" class="form-control" required><br>
						</div>
					</div>
					
					<div class = "form-group row">
						<div class= "col-md-4 col-form-label text-md-right">
							<label for = "occupation"><b>Occupation :</b></label>
						</div>
						<div class = "col-md-6">
							<input type = "text" name = "occupation" placeholder= "Enter Occupation" class="form-control" required><br>
						</div>
					</div>
					
					<div class = "form-group row">
						<div class= "col-md-4 col-form-label text-md-right">
							<label for = "city"><b>City :</b></label>
						</div>
						<div class = "col-md-6">
							<input type = "text" name = "city" placeholder= "City" class="form-control" required><br>
						</div>
					</div>
					
					<div class = "form-group row">
						<div class= "col-md-4 col-form-label text-md-right">
							<label for = "mobileNo"><b>Mobile Number :</b></label>
						</div>	
						<div class = "col-md-6">
							<input type = "text" name = "mobileNo" placeholder= "Enter Mobile Number" class="form-control" required><br>
						</div>
					</div>
					
					<div class = "form-group row">
						<div class= "col-md-4 col-form-label text-md-right">
							<label for = "serviceCharges"><b>Basic Service Charges :</b></label>
						</div>
						<div class = "col-md-6">
							<input type = "text" name = "serviceCharges" placeholder= "Enter Basic Service Charges" class="form-control" required><br>
						</div>
					</div>
					<div class="col-md-6 offset-md-4">
						<button type="submit" class = "btn btn-primary ">Add Service Man</button>
					</div>
				</form>
				</div>
			</div>
		</div>
	</div>
</div>	
			

<script>
$(document).ready(function(){
	  $("form").submit(function(){
	    alert("Service Man Added Successfully!");
	  });
	});

</script>

</body>
</html>