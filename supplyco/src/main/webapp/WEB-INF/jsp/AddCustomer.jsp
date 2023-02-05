<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=number], select {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=number]:focus,
	select {
	background-color: #ddd;
	outline: none;
}

hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 50%;
	opacity: 0.9;
}

button:hover {
	opacity: 1;
}

/* Extra styles for the cancel button */
.cancelbtn {
	padding: 14px 20px;
	background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
	float: left;
	width: 50%;
}

.main-container {
	background-image: linear-gradient(to bottom right, #7BCCB5, #00827F);
}

/* Add padding to container elements */
.container {
	width: 50%;
	padding: 16px;
	margin: auto;
}

/* Clear floats */
.clearfix::after {
	content: "";
	clear: both;
	display: table;
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
		<form action="/addCustomer" style="border: 1px solid #ccc" method="post">
			<div class="container">
				<h1 style="color: black; text-align: center;">Add Customer</h1>

				<hr>

				<label for="categoryName" style="color: white;"><b>Customer Category</b></label>  
				<select	name="categoryName" id="categoryName">
					<c:forEach items="${list}" var="object">
						<option value="${object}">${object}</option>	
					</c:forEach>
				</select> 
				
				<label for="customerName" style="color: white;"><b>Customer Name</b></label>
				 <input type="text" placeholder="Enter Name" name="customerName"	required> 
					<label for="" style="color: white;"><b>Customer Password</b></label> 
					<input type="password" placeholder="Enter Password"	name="customerPassword" required> 
					<label for="vendorType"	style="color: white;"><b>Customer Type</b></label>
				 <select name="customerType" id="customerType">
					<option value="Individual">Individual</option>
					<option value="Organization">Organization</option>
				</select>

				<div class="clearfix">
					<button type="submit" class="signupbtn">SUBMIT</button>
				</div>
			</div>
		</form>
	</div>

</body>
</html>