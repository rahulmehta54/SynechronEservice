<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<title>Customer Manager</title>
</head>
<body>

<%@ page import="com.example.demo.entity.User" %>
<% User user =(User)session.getAttribute("userSession");
   String name =user.getFirstName();
%>
<h3>Welcome <%= name %></h3>
<div align="center">
    <h3>Our All ServiceProviders</h3>
    <br>
    <div align="right">
    <a href="viewCart" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-shopping-cart"></span> Shopping Cart
        </a>
    </div>
     <div>
        <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
        </form>
     </div>
   <dir><h4>${msgForCartAddOperation}</h4></dir>
   <br>
   <div align="center">
    <h4>Search Result</h4>
    <div>
    <table  class="table table-striped" border="1" cellpadding="1">
        <tr>
            <th>serviceId</th>
            <th>firstName</th>
            <th>LastName</th>
            <th>city</th>
            <th>category</th>
            <th>charges</th>
        </tr>
        <c:forEach items="${result}" var="customer">
        <tr>
            <td>${customer.serviceId}</td>
            <td>${customer.firstName}</td>
            <td>${customer.lastName}</td>
            <td>${customer.city}</td>
            <td>${customer.category}</td>
             <td>${customer.charges}</td>
            <td align="center">
					<a href="${customer.serviceId}">Buy Now</a>
				</td>
        </tr>
        </c:forEach>
    </table>
    </div>
</div>  
   
   
</div>   
</body>
</html>