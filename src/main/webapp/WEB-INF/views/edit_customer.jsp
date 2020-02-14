<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix ="fmt"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <nav class="navbar navbar-light" style="background-color: yellow">
<div align="center">
        <h2>Edit Servive Providers</h2>
       
        <form:form action="saveEditedData" method="post" modelAttribute="serviceProviderInfo">
            <table border="0" cellpadding="5">
                <tr>
                    <td>Service Provider ID: </td>
                    <td>${serviceProviderInfo.serviceId}
                        <form:hidden path="serviceId"/>
                    </td>
                </tr>        
                <tr>
                    <td>Category: </td>
                    <td><form:input path="category" /></td>
                </tr>
                <tr>
                    <td>Provider Name: </td>
                    <td><form:input path="providerName" /></td>
                </tr>
                <tr>
                    <td>Mobile Number: </td>
                    <td><form:input path="mobileNumber" /></td>
                </tr>  
                <tr>
                    <td>City: </td>
                    <td><form:input path="city" /></td>
                </tr> 
                <tr>
                    <td>Experience: </td>
                    <td><form:input path="experience" /></td>
                </tr>
                <tr>
                    <td>Inspection Rate: </td>
                    <td><form:input path="inspectionRate" /></td>
                </tr>   
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
      
    </div>
<div>
 <input type=button value="Back" onCLick="history.back()">	
 </div>
   </nav>
</body>
</html>