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
<form action="RegisterServicebyAdmin" method="post">
<br>
<div class="row">
    <div class="col-lg-6 col-lg-offset-3">
<div class="well" style="color:#FF338A;text-align: center;"><b>ADD SERVICE</b></div>

<div class="dropdown">

 <select name="catagory">
    <option value="Carpenter">Carpenter</option>
    <option value="Electrician">Electrician</option>
    <option value="Plumber">Plumber</option>
    <option value="Drivers">Drivers</option>
  </select>
  </div>
  <br><br>
  <div class="form-group">
    <label for="name">FirstName:</label>
    <input type="text" class="form-control" name="firstName" id="name">
  </div>
  <div class="form-group">
    <label for="contact">ContactNum:</label>
    <input type="text" class="form-control" name="contactNum" id="contact">
  </div>
  <div class="form-group">
    <label for="city">City:</label>
    <input type="text" class="form-control" name="city" id="city">
  </div>
  <div class="form-group">
    <label for="exp">Experience in Num:</label>
    <input type="number" class="form-control" name="experience" id="exp">
  </div>
  <div class="form-group">
    <label for="rate">Rates:</label>
    <input type="text" class="form-control" name="rates" id="rate">
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</div>
</div>
</div>
</body>
</html>