<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Sale</title>
</head>
<style>
body, html {
	font-family: Arial, Helvetica, sans-serif;
	height: 100%;
}

* {
	box-sizing: border-box
}

form{
	margin: auto;
	width: 50%;
	padding-top: 50px;
}
/* Full-width input fields */
input[type=text], input[type=password], input[type=number], input[type=date],
	select {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=number]:focus,
	input[type=date]:focus, select{
	background-color: #ddd;
	outline: none;
}

input[type=submit], button {
	background-color: #04AA6D;
	border: none;
	color: white;
	padding: 16px 32px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}
input[type=submit]{
	float: right;
}
 button {
  float: inherit;
  width: 16%;
 }
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

.main-container {
	background-image: linear-gradient(to bottom right, #7BCCB5, #00827F);
	height: 100%;
}

/* Add padding to container elements */
.container {
	width: 70%;
	padding: 16px;
	margin: auto;
}

.label {
	color: white;
}
.button{
text-align: center;
}
/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
	.cancelbtn, .signupbtn {
		width: 100%;
	}
}
</style>
<body>
	<div class="main-container">
		<div class="container">
		<form action="saveSale" method="post">
			<h1 style="color: black; text-align: center;">Add Sale</h1>
			<label class="label" >Select Vendor</label>
			<select	name="vendorName" id="vendorName">
					<option value="" disabled="disabled">Select Vendor</option>
					<c:forEach items="${list}" var="object">
						<option value="${object}">${object}</option>	
					</c:forEach>
			</select> 
			<label class="label" >Select Customer</label>
			<select	name="customerName" id="customerName">
					<option value="" disabled="disabled">Select Customer</option>
					<c:forEach items="${lists}" var="object">
						<option value="${object}">${object}</option>	
					</c:forEach>
			</select> 
			<label class="label" >Sale Amount</label>
			<input type="number" placeholder="Enter Sale Amount" name="saleAmount" required>
			<label class="label" >Sale Quantity</label>
    		<input type="number" placeholder="Enter Sale Quantity" name="saleQuantity" required>
    		<label class="label" >Sale Date</label>
    		<input type="date" placeholder="Select Date" name="date" required>
    		<a href="goBackAdd" ><img alt="" src="/images/backarrow.png" width="50" height="50" style="padding-top: 5px; "></a>
    		<input type="submit" value="ADD">
		</form>
			<div class="button">
			
			<a href="viewSale" ><button style="background-color: blue;">View Sale</button> </a>
			</div>
		</div>
	</div>

</body>
</html>