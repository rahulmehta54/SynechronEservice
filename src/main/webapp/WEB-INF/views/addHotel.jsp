<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<form:form method="post" action="login">
<div>
<label></label>
<form:input path="hotelName"/>
</div>
<div>
<label>Hotel Code</label>
<form:input path="hotelCode"/>
</div>
<div>
<label>Image file</label>
<form:input path="image" placeholder="Enter the file name"/>
</div>

<input type="submit" value=submit>



</form:form>

</body>
</html>