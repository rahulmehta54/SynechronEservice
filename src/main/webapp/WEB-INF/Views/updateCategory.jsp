<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/addCategory" method="post">
		<input type="hidden"  name="cid" value="${id}"> <input
			type="text" name="name" value="${name}"> <input type="submit"
			name="submit" value="add">
	</form>
</body>
</html>