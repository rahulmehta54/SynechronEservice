<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<link href="css/login.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<%-- 
	<form:form action="login" method="post">

		<label>Email</label>
		<form:input path="email" />
		<label>Pass</label>
		<form:input path="password" />
		<form:radiobutton path="role" value="user" />user <br>
		<form:radiobutton path="role" value="admin" />admin 
		
		<input type="submit" value=submit>
	</form:form> --%>

	<div class="login-page">
		<div class="form">
			<form class="register-form">
				<input type="text" placeholder="name" /> <input type="password"
					placeholder="password" /> <input type="text"
					placeholder="email address" />
				<button>create</button>
				<p class="message">
					Already registered? <a href="#">Sign In</a>
				</p>
			</form>
			<form class="login-form">
				<input type="text" placeholder="username" /> <input type="password"
					placeholder="password" />
				<button>login</button>
				<p class="message">
					Not registered? <a href="#">Create an account</a>
				</p>
			</form>
		</div>
	</div>
</body>
</html>