<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/addServiceMen" method="post">
<%-- <input type="text" name="sFName" value="${ServiceMen.sFName}"> --%>
<input type="text" name="sLName" value="${ServiceMen.sLName}">
<input type="text" name="category" value="${ServiceMen.category}">
<input type="text" name="mob" value="${ServiceMen.mob}">
<input type="text" name="experience" value="${ServiceMen.experience}">
<input type="submit" name="submit" value="submit">
</form>
</body>
</html>