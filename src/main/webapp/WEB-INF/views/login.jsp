<!------ Include the above in your HEAD tag ---------->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<title>Login Page</title>

   
	<!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="/css/login.css">
</head>
<body>
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Log In</h3>
				
			</div>
			<div class="card-body">
				<form:form action="login" method="post" autocomplete="off">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<form:input path="email" class="form-control" placeholder="username"/>
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<form:input path="password" type="password" class="form-control" placeholder="password"/>
					</div>
					
					<div class="input-group form-group">
					
						<form:radiobutton path="role"  class="form-control" value="user" /><h3 style="color:blue;">user</h1> 
						<form:radiobutton path="role"  class="form-control" value="admin" /><h3 style="color:blue;">admin</h3> 
					</div>
					

					<div class="form-group">
						<input type="submit" value="submit">
					</div>
				</form:form>
				
				<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Don't have an account?<a href="signup">Sign Up</a>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>




















