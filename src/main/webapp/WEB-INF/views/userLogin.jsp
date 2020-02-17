<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	

	
<!DOCTYPE html>
<html>
<head>
<link href ="CSS/style.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<meta charset="ISO-8859-1">
<link href ="css/style.css" rel="stylesheet">

<title>Login Module</title>
</head>
<body>
<form:form action="userLogin" method="post">  



<div class="sidenav">
         <div class="login-main-text">
            <h2>Application<br> Login Page</h2>
            <p>Login or register from here to access.</p>
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <form>
                  <div class="form-group">
                     <label>UserID</label>
                     <input type="text" class="form-control"  name="emailID">
                  </div>
                  <div class="form-group">
                     <label>Password</label>
                     <input type="password" class="form-control"name="userPassword">
                  </div>
                   <div class="form-group">
                     <input type="hidden" name="role" value="user">
                  </div>
                  <button type="submit" class="btn btn-black">Login</button>
                  <a type="button" class="btn btn-secondary" href="userSignUp">Register</a>
                  
               </form>
            </div>
         </div>
      </div>

















<%-- 

UserID:<input type="text" name="emailID"/><br/><br/>  
Password:<input type="password" name="userPassword"/><br/><br/>  
<input type="hidden" name="role" value="user">
<input type="submit" value="login"/>
<br>
<div>${error}</div>
<br>
<br>
<a href="userSignUp">SignUp</a> --%>

</form:form>
</body>
</html>