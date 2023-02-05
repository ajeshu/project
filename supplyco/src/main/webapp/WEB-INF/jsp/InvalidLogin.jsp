<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View User</title>
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
				<h1 style="color: #fff;">Your Email / Password Does not match....</h1>
				<h2 style="color: #fff;">Please enter valid details...</h2>
				<p><a href="invalidLogin" style="text-decoration: none; color: #570C7D;">Go To Login</a></p>

		</div> 
	
	</div>

</body>
</html>
