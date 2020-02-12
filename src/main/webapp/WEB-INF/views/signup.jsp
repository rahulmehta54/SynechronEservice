<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User Data</title>
</head>
<style>
    div.ex {
        text-align: right;
        width: 300px;
        padding: 10px;
        border: 5px solid grey;
        margin: 0px
    }
</style>
<body>
<h1>Registration Form</h1>
<div class="ex">
 
<form:form method="post" action="signup">
<div>
<label>Name</label>
<form:input path="name"/>
</div>
<div>
<label>E-mail</label>
<form:input path="email"/>
</div>
<div>
<label>Password</label>
<form:input path="password"/>
</div>
<div>
<label>City</label>
<form:input path="city"/>
</div>
<div>
<label>Phone-number</label>
<form:input path="phoneNumber"/>
</div>
<form:radiobutton path="role" value="user"/>user 
<form:radiobutton path="role" value="admin"/>admin 


<input type="submit" value=submit>



</form:form>
    
</div>
</body>
</html>