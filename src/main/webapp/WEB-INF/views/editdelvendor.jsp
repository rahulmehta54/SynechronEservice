<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="deleteSaleperson" modelAttribute="vendorlist">
	 <table border="1" cellspacing="0" cellpadding="0" :>
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>experience</th>
				<th>Rate</th>
				<th>Delete</th>
			</tr>
		</thead>
	</table>
	<tbody>
		<c:forEach items="${vendorlist}"  varStatus="status" var="vendor">
			<table>
				<thead>
					<tr>
						<td><c:out value="${ vendor.id}"></c:out></td>
						<td><c:out value="${ vendor.salePersonName}"></c:out></td>
						<td><c:out value="${ vendor.category}"></c:out></td>
						<td><c:out value="${ vendor.experience}"></c:out></td>
						<td><c:out value="${ vendor.rate}"></c:out></td>
						<td><c:out value="${ vendor.city}"></c:out></td>
						<td><c:out value="${ vendor.mobileNumber}"></c:out></td>
 			<td>	<input type="checkbox" name="check" value="${vendor.id}"></td>
 			<td><a href="editvendor/${vendor.id}">Edit</a></td>  
 			 </tr>
				</thead>
			</table>

		</c:forEach>
	</tbody>
	<button type="submit" >submit</button>
	</form:form>
</body>
</html>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>

<body>
	<h2>Spring's form checkbox example</h2>

	<form:form method="POST" commandName="customerForm">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Subscribe to newsletter? :</td>
				<td><form:checkbox path="receiveNewsletter" /></td>
				<td><form:errors path="receiveNewsletter" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Favourite Languages :</td>
				<td>
                                       <form:checkbox path="favLanguages" value="Java" />Java 
                                       <form:checkbox path="favLanguages" value="C++" />C++ 
                                       <form:checkbox path="favLanguages" value=".Net" />.Net
                                </td>
				<td><form:errors path="favLanguages" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Favourite Web Frameworks :</td>
				<td><form:checkboxes items="${webFrameworkList}"
						path="favFramework" /></td>
				<td><form:errors path="favFramework" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>

 --%>













