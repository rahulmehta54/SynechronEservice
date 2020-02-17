<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is your cart</title>
</head>
<body>
<div align="center">
<table border="2" >
<tr>
 <th>SercviceID</th>
 <th>firstName</th>
 <th>lastName</th>
 <th>city</th>
 <th>category</th>
 <th>charges</th>
</tr>
<c:forEach var="itm" items="${cartValue}">
<tr>
  <td><c:out value="${itm.sp.serviceId}"/></td>
  <td><c:out value="${itm.sp.firstName}"/></td>
  <td><c:out value="${itm.sp.lastName}"/></td>
  <td><c:out value="${itm.sp.city}"/></td>
  <td><c:out value="${itm.sp.category}"/></td>
  <td><c:out value="${itm.sp.charges}"/></td>
</tr>

</c:forEach>



</tr>
</table>


</div>



</body>
</html>