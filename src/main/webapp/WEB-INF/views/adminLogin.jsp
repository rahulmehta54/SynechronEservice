<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
<title>Admin login</title>
</head>

<body>
<h2>ADMIN LOGIN</h2>
<form:form action="userLogin" method="post">  
<!-- 
UserID:<input type="text" name="emailID"/><br/><br/>  
Password:<input type="password" name="userPassword"/><br/><br/>  
<input type="hidden" name="role" value="admin">
<input type="submit" value="adminLogin"/>
<br> -->



<div class="sidenav">
         <div class="login-main-text">
            <h2>Admin<br> Login Page</h2>
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
                     <input type="hidden" name="role" value="admin">
                  </div>
                  <button type="submit"  class="btn btn-black">Login</button>
                 
               </form>
            </div>
         </div>
      </div>


</form:form>
</body>
</html>