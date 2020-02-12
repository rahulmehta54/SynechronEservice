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
<h1>Sales person Registration Form</h1>
<div class="ex">
 
<form:form method="post" action="addSaleperson">
<div>
<label>Name</label>
<form:input path="salePersonName"/>
</div>
<label>Category</label>
<form:select path = "category">
   <form:option value = "NONE" label = "Select"/>
   <form:options items = "${categoryList}" />
</form:select> 


<div>
<label>City</label>
<form:input path="city"/>
</div>
<div>
<label>mobile-Number</label>
<form:input path="mobileNumber"/>
</div>
<div>
<label>Rate</label>
<form:input path="rate"/>
</div>
<div>
<label>Experience</label>
<form:input path="experience"/>
</div>



<input type="submit" value=submit>



</form:form>
    
</div>
</body>
</html>