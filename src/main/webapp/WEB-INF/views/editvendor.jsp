<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
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
        <h1>Edit Employee</h1>  
       <h1>Edit</h1>  
       <form:form method="POST" action="/editandsavee"  modelAttribute="edditt">    
        <table >    
        <tr>  
          
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="salePersonName"  /></td>  
         </tr>    
         <tr>    
          <td>mobileNumber :</td>    
          <td><form:input path="mobileNumber" /></td>  
         </tr>
         <tr>    
          <td>City : </td>   
          <td><form:input path="city"  /></td>  
         </tr> 
         <tr>    
          <td>rate : </td>   
          <td><form:input path="rate"  /></td>  
         </tr>
         <tr>    
          <td>experience : </td>   
          <td><form:input path="experience"  /></td>  
         </tr>  
         <tr>   
        
         <form:select path = "category">
   <form:option value = "NONE" label = "Select"/>
   <form:options items = "${categoryList}" />
</form:select>   
          
         <tr>    
            
          <td><input type="submit"  value=submit /></td>    
         </tr>    
        </table>    
       </form:form>    
       </body>
</html>