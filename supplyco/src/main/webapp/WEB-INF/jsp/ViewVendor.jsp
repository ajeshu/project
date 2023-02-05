<%@page import="com.koottam.supplyco.entity.UserEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Vendor</title>
</head>
<style>
body,html{
	font-family: Arial, Helvetica, sans-serif;
	height: 100%;
}

* {
	box-sizing: border-box
}

form{
margin:auto;
width: 50%;
padding-top: 50px;
}
/* Full-width input fields */
input[type=text], input[type=password], input[type=number] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=number]:focus
	{
	background-color: #ddd;
	outline: none;
}
input[type=submit] {
 background-color: #04AA6D;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
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
th, td,table{
border: 1px solid white; 
border-collapse: collapse;
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
			<div class="container" style="overflow-x:auto;">
			<hr>
				<h1 style="color: #fff;">Vendors</h1>
				<table style="width: 100%">
				
					<tr>
						<th>Vendor ID</th>
						<th>Vendor Category ID</th>
						<th>Vendor Name</th>
						<th>Vendor Type</th>
						<th>Vendor Address</th>
						<th>Edit</th>
				<%
					UserEntity user = (UserEntity)request.getSession().getAttribute("user");
					if( user.getUserType().equals("Admin")){
				%>
					<th>Delete</th>
				<%
					}else{
				%>
					<th style="display: none;">Delete</th>
				<%
					}
				%>
						
					</tr>
					<c:forEach items="${list}" var="object">
					<tr>
						<td>${object.getvId()}</td>
						<td>${object.getCatId()}</td>
						<td>${object.getvName()}</td>
						<td>${object.getvType()}</td>
						<td><a href="getAddress/${object.addId}" style="text-decoration: none; color: #6D149A;">Address</a></td>
						<td><a href="getVendor/${object.vId}" style="text-decoration: none; color: #6D149A;">Edit</a></td>
						
						<% 		
						if( user.getUserType().equals("Admin")){
							%>
							<td><a href="deleteVendor/${object.vId}" style="text-decoration: none; color: #6D149A;">Delete</a></td>
							<%
						}else{
							%>
							<td style="display: none;"><a href="deleteVendor/${object.vId}" style="text-decoration: none; color: #6D149A;">Delete</a></td>
							<%
						}
	
							%>
					</tr>
					</c:forEach>
				</table>
		<br><a href="goBackAdd" ><img alt="" src="/images/backarrow.png" width="50" height="50"></a>
			
	</div>
	
	</div>

</body>
</html>