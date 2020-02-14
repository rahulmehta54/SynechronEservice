<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<nav class="navbar navbar-light" style="background-color: yellow">
		<div class="col-md-6">
			<form:form method="get" action="searchByCityName">
				<div class="form-group">
					 <label>Cities</label> <form:select path="city" name="ServiceProviderInfo">
						 <c:forEach items="${listCity}" var="ServiceProviderInfo">
							<option value="${ServiceProviderInfo}">${ServiceProviderInfo}</option>
						</c:forEach> 
					</form:select>
					</div>
					<div>
						<input type="submit" value="Search" class="btn btn-info">
					</div>
					
			</form:form>
		</div>
		 <input type=button value="Back" onCLick="history.back()">
		 </nav>
	</div>
</body>
</html>