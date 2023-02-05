<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
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
input[type=text], input[type=password], input[type=number], input[type=email], select {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=number]:focus, input[type=email]:focus, select
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
	width: 50%;
	padding: 16px;
	margin: auto;
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
		<form action="/saveUser" method="post">
		  <h1 style="color: black; text-align: center;">Edit User</h1>
			<div class="container">
				
    			<input type="hidden" name="userId" value="${user.getUserId()}" required>
				<label for="User" style="color: white;"><b>User Name</b></label>
    			<input type="text" name="userName" value="${user.getUserName()}" required>
    			<label for="User" style="color: white;"><b>User Email</b></label>
    			<input type="email" name="userEmail" value="${user.getUserEmail()}" required>
    			<label for="User" style="color: white;"><b>User Password</b></label>
    			<input type="password" name="password" value="${user.getUserPassword()}" required>
    			
    			<label for="userType" >UserType</label>
					<select  name="userTYPE"  id="userType" >
						 <option value="${user.getUserType()}">${user.getUserType()}</option>
 						 <option value="Admin">Admin</option>
 						 <option value="Back Office">Back Office</option>
					</select>
		
				<input type="submit" value="SUBMIT"> 
			</div>
		</form>
	</div>

</body>
</html>