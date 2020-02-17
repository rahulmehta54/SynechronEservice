<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello admin</title>
</head>
<body>

<%=session.getAttribute("email")%>
                      hello admin 
               <h1>${name}</h1>
               <a href="addSaleperson">add a salespeson</a>
                 <a href="deleteSaleperson">del a salespeson</a>

</body>
</html>