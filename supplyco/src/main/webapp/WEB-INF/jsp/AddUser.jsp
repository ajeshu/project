<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<style>
@import url('https://fonts.googleapis.com/css?family=Raleway:400,700');

* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	font-family: Raleway, sans-serif;
}

body {
	background: linear-gradient(270deg, #7BCCB5, #00827F);
}

.container {
	display: flex;
	align-items: center;
	justify-content: center;
	min-height: 100vh;
}

.screen {
	background: linear-gradient(270deg, #7BCCB5, #00827F);
	position: relative;
	height: 600px;
	width: 360px;
	box-shadow: 0px 0px 24px #5C5696;
}

.screen__content {
	z-index: 1;
	position: relative;
	height: 100%;
}

.screen__background {
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	z-index: 0;
	-webkit-clip-path: inset(0 0 0 0);
	clip-path: inset(0 0 0 0);
}

.screen__background__shape {
	transform: rotate(45deg);
	position: absolute;
}

.screen__background__shape1 {
	height: 520px;
	width: 520px;
	background: #FFF;
	top: -50px;
	right: 120px;
	border-radius: 0 72px 0 0;
}

.screen__background__shape2 {
	height: 220px;
	width: 220px;
	background: linear-gradient(270deg, #7BCCB5, #00827F);
	top: -172px;
	right: 0;
	border-radius: 32px;
}

.screen__background__shape3 {
	height: 540px;
	width: 190px;
	background: linear-gradient(270deg, #7BCCB5, #00827F);
	top: -24px;
	right: 0;
	border-radius: 32px;
}

.screen__background__shape4 {
	height: 400px;
	width: 200px;
	background: linear-gradient(270deg, #7BCCB5, #00827F);
	top: 420px;
	right: 50px;
	border-radius: 60px;
}

.login {
	width: 320px;
	padding: 30px;
	/* padding-top: 5px; */
}

.login__field {
	padding: 10px 0px;
	position: relative;
}

.login__icon {
	position: absolute;
	top: 30px;
	color: #7875B5;
}

.login__input, select {
	border: none;
	border-bottom: 2px solid #D1D1D4;
	background: none;
	padding: 10px;
	padding-left: 24px;
	font-weight: 700;
	width: 75%;
	transition: .2s;
}

.login__input:active, .login__input:focus, .login__input:hover {
	outline: none;
	border-bottom-color: #6A679E;
}

.login__submit {
	background: #fff;
	font-size: 14px;
	margin-top: 30px;
	padding: 16px 20px;
	border-radius: 26px;
	border: 1px solid #D4D3E8;
	text-transform: uppercase;
	font-weight: 700;
	display: flex;
	align-items: center;
	width: 100%;
	color: #4C489D;
	box-shadow: 0px 2px 2px #5C5696;
	cursor: pointer;
	transition: .2s;
}

.login__submit:active, .login__submit:focus, .login__submit:hover {
	border-color: #6A679E;
	outline: none;
}

.button__icon {
	font-size: 24px;
	margin-left: auto;
	color: #7875B5;
}

.social-login {
	position: absolute;
	height: 140px;
	width: 160px;
	text-align: center;
	bottom: 0px;
	right: 0px;
	color: #fff;
}

.social-icons {
	display: flex;
	align-items: center;
	justify-content: center;
}

.social-login__icon {
	padding: 20px 10px;
	color: #fff;
	text-decoration: none;
	text-shadow: 0px 0px 8px #7875B5;
}

.social-login__icon:hover {
	transform: scale(1.5);
}

</style>

<body>
	<div class="container">
		<div class="screen">
			<div class="screen__content">
				<div style="height: 20%;">
					<img alt="luminar-home" src="images/slogo.png" width=100%
						height="140px">
				</div>


				<form class="login" action="submitUser" method="post">
					<div class="login__field">
						<i class="login__icon fas fa-user"></i> <label
							style="color: black;"><b>User Name</b></label> <input type="text"
							class="login__input" name="username" placeholder="User Name">
					</div>
					<div class="login__field">
						<i class="login__icon fas fa-user"></i> <label
							style="color: black;"><b>User Email</b></label> <input
							type="email" class="login__input" name="email"
							placeholder="Email">
					</div>
					<div class="login__field">
						<i class="login__icon fas fa-lock"></i> <label
							style="color: black;"><b>Password</b></label> <input
							type="password" class="login__input" name="password"
							placeholder="Password">
					</div>
					<div class="login__field">
						<i class="login__icon fas fa-lock"></i>
						 <label	style="color: black;"><b>User Type</b></label> 
						<select	name="usertype" id="usertype">
							<option value="Admin">Admin</option>
							<option value="Back Office">Back Office</option>
						</select>
					</div>

					<button class="button login__submit">
						<span class="button__text">SUBMIT</span> <i
							class="button__icon fas fa-chevron-right"></i>
					</button>
					<br><a href="goBackAdd" style="text-decoration: none; text-align: right;">Go Back</a>
				</form>
				
			</div>
			<div class="screen__background">
				<span class="screen__background__shape screen__background__shape4"></span>
				<span class="screen__background__shape screen__background__shape3"></span>
				<span class="screen__background__shape screen__background__shape2"></span>
				<span class="screen__background__shape screen__background__shape1"></span>
			</div>
		</div>
	</div>
<script type = "text/javascript" >  
    function preventBack() { window.history.forward(); }  
    setTimeout("preventBack()", 0);  
    window.onunload = function () { null };  
</script>

</body>
</html>
