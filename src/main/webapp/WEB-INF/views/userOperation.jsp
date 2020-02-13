<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix ="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 class="centerText blue">${listServicemen}</h1>
	<table>
		<c:forEach items="${listServicemen}" var="user">
			<tr>
				<nav class="navbar navbar-light" style="background-color: red">
					<ul class="navbar-nav">

						<li class="nav-item"><a href="viewAllServicemen?id=${user.userId}">View All Servicemen</a></li>
						<li class="nav-item"><a href="viewOrders">View Orders</a></li>
						<li class="nav-item"><a href="viewCart?userId=${user.userId}">View Cart</a></li>
						<li class="nav-item"><a href="SearchByCategoty">Search By Category</a></li>
						<li class="nav-item"><a href="SearchByCity">Search By City</a></li>
					</ul>
				</nav>
				<td>${user.userId}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>