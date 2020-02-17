<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<br>
<div class="container">
<div class="row">
        <div class="col-xs-12">
           <div  class="text-center">
           <br>
           <br>
<form action="/payment" method="post">
<label for="total">Cash</label>
<input type="text" id="total" name="price" value="${totalAmt}" readonly>
<br>
<br>
<p><b>Payment mode</b></p>
<label for="cash">Cash</label>
<input type="radio" id="cash" name="payMode" value="Cash">
<br>
<label for="card">Card</label>
<input type="radio" id="card" name="payMode" value="Card">
</div>
        </div>
     </div>
    <div  class="text-center">
    <br>
<input type="submit" value="Pay">
</div>
 </form>
  
 </div>
</body>
</html>