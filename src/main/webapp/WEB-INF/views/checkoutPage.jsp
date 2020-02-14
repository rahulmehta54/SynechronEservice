<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="css/all.min.css" rel="stylesheet" type="text/css"></link>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"></link>
<link href="css/checoutpage.css" rel="stylesheet" type="text/css"></link>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/momentjs/2.14.1/moment.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="js/addmincrud.js"></script>
<body>

<form action="/checkoutPayment" method="post">
	<div class='container'>
		<div class='window'>
			<div class='order-info'>
				<div class='order-info-content'>
					<h2>Order Summary For Service Provider</h2>
					<c:set var="total" value="0" />

					<input type="text" value="${userid}" name="userid" hidden="hidden">
					<c:forEach var="serviceProvider" items="${serviceproviders}">
                        <input type="text" value="${serviceProvider.serviceId}" name="serviceid" hidden="hidden">
						<div class='line'></div>
						<table class='order-table'>
							<tbody>
								<tr>
									<td><br> <span class='thin'>${ serviceProvider.firstName}
											${ serviceProvider.lastName}</span> <br>${ serviceProvider.city}<br>
										<span class='thin small'><b>Service Type: ${ serviceProvider.category}</b><br>
										<br></span></td>

								</tr>
								<tr>
									<td>
										<div class='price'>Rupee : ${serviceProvider.rate}</div> <c:set
											var="total" value="${total + serviceProvider.rate}" />
									</td>
								</tr>
							</tbody>
						</table>
					</c:forEach>
					
					  <div class="form-group">
							<label class="control-label">Appointment Time</label>
							<div class='input-group date' id='datetimepicker1'>
								<input type='text' class="form-control" name="datetime"/> <span
									class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span>
								</span>
							</div>
					  </div>
					  
                   
					
					<div class='line'></div>
					<div class='total'>
						<span style='float: left;'> TOTAL </span> <span
							style='float: right; text-align: right;'>${total}</span>
					</div>
				</div>






			</div>
			<div class='credit-info'>
				<div class='credit-info-content'>

					

							<img
								src='https://dl.dropboxusercontent.com/s/ubamyu6mzov5c80/visa_logo%20%281%29.png'
								height='80' class='credit-card-image' id='credit-card-image'></img>
							Card Number <input class='input-field' name="cnumber"></input> Card Holder <input
								class='input-field' name="cname"></input>
							<table class='half-input-table'>
								<tr>
									<td>Expires <input name="exp" class='input-field'></input>
									</td>
									<td>CVC <input name="cvc" class='input-field'></input>
									</td>
								</tr>
							</table>
							<button type="submit" class='pay-btn'>Checkout</button>

						</div>

					</div>
				</div>
			</div>
</form>			
</body>
</html>