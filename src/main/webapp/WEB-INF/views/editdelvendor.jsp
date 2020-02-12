<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>experience</th>
				<th>Rate</th>
			</tr>
		</thead>
	</table>
	<tbody>
		<c:forEach items="${vendorlist}" var="vendor">
			<table>
				<thead>
					<tr>
						<td><c:out value="${ vendor.id}"></c:out></td>
						<td><c:out value="${ vendor.salePersonName}"></c:out></td>
						<td><c:out value="${ vendor.experience}"></c:out></td>
						<td><c:out value="${ vendor.rate}"></c:out></td>
				 </tr>
				</thead>
			</table>

		</c:forEach>
	</tbody>
</body>
</html>