<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Employee</h1>  
       <form:form method="POST" action="editandsave">    
        <table >    
        <tr>  
        <td>id</td>    
         <td><form:input  path="id" /></td>  
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
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    