<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<link href = "css/style.css" rel="stylesheet">
<link href = "images/travel.jpg" rel='icon' >
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<div class="container">
<form action="RegisterServicebyAdmin" method="post">
<br>
<div class="row">
    <div class="col-lg-6 col-lg-offset-3">
<div class="well" style="color:#FF338A;text-align: center;"><b>ADD SERVICE</b></div>

  <div class="form-group">
    <label for="category">category:</label>
    <input type="text" class="form-control" name="category">
  </div>
  <div class="form-group">
    <label for="firstName">FirstName:</label>
    <input type="text" class="form-control" name="firstName" id="firstName">
  </div>
  <div class="form-group">
    <label for="lastName">LastName:</label>
    <input type="text" class="form-control" name="lastName" id="lastName">
  </div>
  <div class="form-group">
    <label for="city">City:</label>
    <input type="text" class="form-control" name="city" id="city">
  </div>
  
  <div class="form-group">
    <label for="rate">Rates:</label>
    <input type="text" class="form-control" name="charges" id="charges">
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</div>
</div>
</div>
</body>
</html>