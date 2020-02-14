<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix ="fmt"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style> 
        .inputClass { 
            pointer-events: none;  
        } 
</style>
</head>
<body>
<div align="center">
<nav class="navbar navbar-light" style="background-color: yellow">
<%-- <h1 class="centerText blue">${cartId}</h1>
<h1 class="centerText blue">${userId}</h1>
<h1 class="centerText blue">${serviceProviderInfo}</h1> --%>
        <h2>Book Servive Providers</h2>
        <form:form method="get" modelAttribute="serviceProviderInfo">
            <table border="0" cellpadding="5">
                <tr>
                    <td>Service Provider ID: </td>
                    <td>${serviceProviderInfo.serviceId}
                        <form:hidden path="serviceId" />
                    </td>
                </tr>        
                <tr>
                    <td>Category: </td>
                    <td><form:input path="category" class="inputClass"/></td>
                </tr>
                <tr>
                    <td>Provider Name: </td>
                    <td><form:input path="providerName" class="inputClass"/></td>
                </tr>
                <tr>
                    <td>Mobile Number: </td>
                    <td><form:input path="mobileNumber" class="inputClass"/></td>
                </tr>  
                <tr>
                    <td>City: </td>
                    <td><form:input path="city" class="inputClass"/></td>
                </tr> 
                <tr>
                    <td>Experience: </td>
                    <td><form:input path="experience" class="inputClass"/></td>
                </tr>
                <tr>
                    <td>Inspection Rate: </td>
                    <td><form:input path="inspectionRate" class="inputClass"/></td>
                </tr>   
                <tr>
                     <!-- <td colspan="2"><input type="submit" value="Book"></td>  -->
                     <td><a href="/BookServiceMen?serviceProviderId=${serviceProviderInfo.serviceId}&userId=${userId}&cartId=${cartId}" ><input type="button" value="Book" name="Book" /></a></td>
                </tr>  
                <tr>                 
                     <td> <input type=button value="Back" onCLick="history.back()"></td>
                </tr>                    
            </table>
       </form:form> 
       </nav>
    </div>

</body>
</html>