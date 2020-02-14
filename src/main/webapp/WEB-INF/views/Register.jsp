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
<div><h3>${fail}</h3></div>
<form action="RegisterUser" method="post">
<br>
<div class="row">
    <div class="col-lg-6 col-lg-offset-3">
<div class="well" style="color:#FF338A;text-align: center;"><b>REGISTER USER</b></div>


 <div class="form-group">
    <label for="firstname">FirstName:</label>
    <input type="text" class="form-control" name="firstName" id="firstname">
  </div>
   <div class="form-group">
    <label for="lastname">LastName:</label>
    <input type="text" class="form-control" name="lastName" id="lastname">
  </div>
  <div class="form-group">
    <label for="contact">ContactNum:</label>
    <input type="text" class="form-control" name="contactNum" id="contact">
  </div>
  <div class="form-group">
    <label for="role">Role:</label>
    <input type="text" class="form-control" name="role" value="user" id="role" readonly>
  </div>
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="number" class="form-control" name="password" id="password">
  </div>
  <div class="form-group">
    <label for="mailId">MailID:</label>
    <input type="text" class="form-control" name="mailId" id="mailId">
  </div>
  
  <div class="form-group">
    <label for="city">City:</label>
    <input type="text" class="form-control" name="city" id="city">
  </div>
  
  <div class="form-group">
    <label for="state">State:</label>
    <input type="text" class="form-control" name="state" id="state">
  </div>
  <div class="form-group">
    <label for="country">Country:</label>
    <input type="text" class="form-control" name="country" id="country">
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</div>
</div>
</div>
</body>
</html>