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
<%@page import= "com.example.demo.entity.Users" %>
<div align="center">
<div class="container">

<div class="well"><h2 style="color:#FF338A"><b>Search For serviceProvider</b></h2></div>
<br>
<br>
<div>
<% Users u=(Users)session.getAttribute("userSession"); %>
<h4 style="color:blue;"><b>Welcome <%= u.getFirstName()  %></b></h4>
</div>
    <div>
        <form  action="userOperation">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
        </form>
     </div>
   
   <div>
   <span><i class="fas fa-shopping-cart"></i></span>
   </div>
   <div align="center">
    <h2>Search Result</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>firstName</th>
            <th>city</th>
            <th>category</th>
        </tr>
        <c:forEach items="${listOfService}" var="customer">
        <tr>
            <td>${customer.firstName}</td>
            <td>${customer.city}</td>
            <td>${customer.catagory}</td>
            <td><a href="addbookServicetoCart/${customer.sid}">AddToCart</a></td>
        </tr>
        </c:forEach>
    </table>
    <br>
    
    <li class="list-group-item list-group-item-primary"><a href="viewCart">ViewCart</a> </li>
</div>  
</div>
</body>
</html>