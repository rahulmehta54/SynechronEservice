<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: yellow">
<%-- <h1 class="centerText blue">${id}</h1>
<h1 class="centerText blue">${userId}</h1 --%>

<a href="viewAllServicemen?id=${userId}">View All Servicemen</a>
<br>
 <input type=button value="Back" onCLick="history.back()">
 </nav>
</body>
</html>