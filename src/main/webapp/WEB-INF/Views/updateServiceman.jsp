<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/addServiceman" method="post">
		<input type="hidden"  name="sid" value="${serviceMan.sid}">
		 <input type="text" name="sName" value="${serviceMan.sName}"> 
		 <input type="text" name="sEmail" value="${serviceMan.sEmail}"> 
		 <input type="text" name="sMobileNo" value="${serviceMan.sMobileNo}"> 
		 <input type="text" name="sAddress.city.name" value="${serviceMan.sAddress.city}"> 
		  <input type="text" name="sCategory.name" value="${serviceMan.sCategory.name}"> 
		 <input type="text" name="sExperience" value="${serviceMan.sExperience}"> 
		

		 
		 <input type="submit" name="submit" value="add">
	</form>
</body>
</html>