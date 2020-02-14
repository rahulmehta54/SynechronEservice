<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css" />

<title>E-Service</title>
</head>
<body>
	<div align="center">
		<div class="col-md-6">
			<br>
			<h2 class="centerText blue">Add ServiceMan</h2>
			<br>



			<form:form action="addServiceman" method="post">
				<br>
				<h4 class="centerText blue">Add Service Man</h4>
				<br>
				<br>

				<div class="form-group">
					<label class="align-left">full Name:</label>
					<form:input path="sName" cssClass="form-control"
						value="${serviceMan.sName}" />
					<input type="hidden" name="sid" value="${serviceMan.sid}"">
				</div>

				<div class="form-group">
					<label class="align-left">Email Id</label>
					<form:input path="sEmail" cssClass="form-control"
						value="${serviceMan.sEmail}" />
				</div>

				<div class="form-group">
					<label class="align-left">Mobile number</label>
					<form:input path="sMobileNo" cssClass="form-control"
						value="${serviceMan.sMobileNo}" />
				</div>

				<div class="form-group">
					<label class="align-left">Experience</label>
					<form:input path="sExperience" cssClass="form-control"
						value="${serviceMan.sExperience}" />
				</div>

				<div class="form-group">
					<label class="align-left">service category</label> <select
						name="sCategory.cid">
						<option>---Select Category---</option>
						<c:forEach items="${categoryList}" var="cat">

							<c:choose>
								<c:when test="${cat.cid eq serviceMan.sCategory.cid}">
									<option value="${cat.cid}" selected="true">${cat.name}</option>
								</c:when>
								<c:otherwise>
									<option value="${cat.cid}">${cat.name}</option>
								</c:otherwise>
							</c:choose>



						</c:forEach>
					</select>
				</div>

				<div class="form-group">
					<label class="align-left">Address Line 1</label>
					<form:input path="sAddress.addLine1" cssClass="form-control"
						value="${serviceMan.sAddress.addLine1}" />
				</div>

				<div class="form-group">
					<label class="align-left">Address Line 2</label>
					<form:input path="sAddress.addLine2" cssClass="form-control"
						value="${serviceMan.sAddress.addLine2}" />
				</div>

				<div class="form-group">
					<label class="align-left">city</label> <select
						name="sAddress.city.id" value="${serviceMan.sAddress.city.id}">
						<option>---Select ---</option>
						<c:forEach items="${cityList}" var="city">

							<c:choose>
								<c:when test="${city.id eq serviceMan.sAddress.city.id}">
									<option value="${city.id}" selected="true">${city.cityName}</option>
								</c:when>
								<c:otherwise>
									<option value="${city.id}">${city.cityName}</option>
								</c:otherwise>
							</c:choose>





						</c:forEach>
					</select>
				</div>


				<div class="form-group">
					<label class="align-left">state</label> <select
						name="sAddress.state.id" value="${serviceMan.sAddress.state.id}">
						<option>---Select ---</option>
						<c:forEach items="${stateList}" var="state">


							<c:choose>
								<c:when test="${state.id eq serviceMan.sAddress.state.id}">
									<option value="${state.id}" selected="true">${state.stateName}</option>
								</c:when>
								<c:otherwise>
									<option value="${state.id}">${state.stateName}</option>
								</c:otherwise>
							</c:choose>



						</c:forEach>
					</select>
				</div>

				<div class="form-group">
					<label class="align-left">inspectioncharge</label>
					<form:input path="inspectioncharge" cssClass="form-control"
						value="${serviceMan.inspectioncharge}" />
				</div>

				<center>
					<div>
						<label>Add Serviceman</label> <input type="submit" value="add">
					</div>
				</center>
			</form:form>



		</div>
	</div>
</body>
</html>