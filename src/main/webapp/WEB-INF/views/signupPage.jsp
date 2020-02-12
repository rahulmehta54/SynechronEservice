<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="css/loginForm.css" rel="stylesheet" type="text/css"></link>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.1/css/all.css"
	integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP"
	crossorigin="anonymous">
<body>

	<div class="container h-100">
		<span><font color="red">${errorMessage}</font></span>
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
				<div class="d-flex justify-content-center">
					<div class="brand_logo_container">
						<img
							src="https://cdn.shopify.com/s/files/1/0092/3120/4403/files/playboy_logo_2_1200x1200.jpg?v=1563709632"
							class="brand_logo" alt="Logo">
					</div>
				</div>
				<div class="d-flex justify-content-center form_container">
					<form:form method="post" action="/signup">
						<div class="input-group mb-3">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<form:input path="emailId" class="form-control input_user"
								placeholder="Enter Email ID" />
						</div>

						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i
									class="fas fa-signature"></i></span>
							</div>
							<form:input path="firstName" class="form-control input_user"
								placeholder="Enter First Name" />
						</div>

						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i
									class="fas fa-signature"></i></span>
							</div>
							<form:input path="lastName" class="form-control input_user"
								placeholder="Enter Last Name" />
						</div>
						<input name="role" type="text" class="form-control input_pass"
							value="user" hidden="hidden" />

						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<form:input path="passWord" class="form-control input_pass"
								placeholder="password" />
						</div>

						<div class="input-group mb-2">
							Gender: <form:radiobutton path="gender"
								class="form-control input_pass" value="male" /> Male<br>
							<form:radiobutton  path="gender"
								class="form-control input_pass" value="female" />
							Female<br>
						</div>
						<div class="d-flex justify-content-center mt-3 login_container">
							<button type="submit" name="button" class="btn login_btn">Log
								in</button>
						</div>
					</form:form>
				</div>

				<div class="mt-4">
					<div class="d-flex justify-content-center links">
						Already a user? <a href="/" class="ml-2">Login</a>
					</div>
					
					<div class="d-flex justify-content-center links" >${succesfull}</div>
					<div class="d-flex justify-content-center links" >${error}</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>