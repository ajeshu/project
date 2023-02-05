<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BackOffice Home</title>

</head>
<style type="text/css">
@import url(https://fonts.googleapis.com/css?family=Roboto:300);

html, body {
	margin: 0;
	height: 100%;
}

.home-page {
	height: 100%;
	width: 100%;
	display: flex;
	justify-content: center;
	margin: auto;
}

.container {
	width: 50%;
	height: 75%;
	background: linear-gradient(270deg, #7BCCB5, white);
	text-align: center;
	border: thick;
	padding-top: 2%;
	border-color: black;
	margin-top: 5%;
	border-color: black
}

.welcome-text {
	font-family: 'Trebuchet MS', sans-serif;
	font-size: 25px;
	font-weight: 800;
}

body {
	background: linear-gradient(270deg, #7BCCB5, #00827F);
	font-family: "Roboto", sans-serif;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
}
/* Dropdown Button */
.dropbtn {
	background: linear-gradient(270deg, black, #00827F);
	color: white;
	padding: 10px;
	width: fit-content;
	font-size: 16px;
	border-radius: 15px 15px 15px;
	border-style: none;
}

/* The container <div> - needed to position the dropdown content */
.dropdown {
	position: relative;
	display: inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
	display: none;
	position: absolute;
	background-color: #F8F3FB;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {
	background-color: #F6ECFE;
}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
	display: block;
}

/* Change the background color of the dropdown button when the dropdown content is shown */
.dropdown:hover .dropbtn {
	background-color: #3e8e41;
}
.welcome-text{
text-align: left;
padding-left: 30px;
text-shadow: 0 0 3px #fff, 0 0 5px #C7BAFE;

}
</style>


<body>
	<div class="home-page">
		<div class="container">
			<div class="logo" style="height: 30%;">
				<img alt="luminar-home" src="images/slogo.png" width="25%"	height="100px">
			</div>
			<div class="welcome-text">
				<h3 id="welcome" >Welcome ${user.getUserName()} !</h3>
			</div>
			<div>

				<div class="dropdown">
					<button class="dropbtn">Vendor</button>
					<div class="dropdown-content">		
						<a href="addressForm">Add</a>
						<a href="viewVendor">View</a>
						<a href="vendorCategory">Category</a>
						
					</div>
				</div>
				<div class="dropdown">
					<button class="dropbtn">Customer</button>
					<div class="dropdown-content">
						<a href="customerCategory">Category</a>
						<a href="custAddressForm">Add Customer</a>
						<a href="viewCustomer">View Customer</a>
					</div>
				</div>
				<div class="dropdown">
					<button class="dropbtn">Inventory</button>
					<div class="dropdown-content">
						<a href="viewItem">Item</a>
						<a href="addSale">Sale</a>
						<a href="viewStock">Stock</a>
						<a href="viewStockCategory">Stock Category</a> 
					</div>
				</div>
				<!-- <div class="dropdown">
					<button class="dropbtn">Reports</button>
					<div class="dropdown-content">
						<a href="ConfirmSignout.html">Customers</a> <a
							href="ConfirmSignout.html">Vendors</a> <a
							href="ConfirmSignout.html">Stock</a> <a
							href="ConfirmSignout.html">Sale</a>

					</div>
				</div> -->
				<div class="dropdown">
					<button class="dropbtn">Settings</button>
					<div class="dropdown-content">
						<a href="changePassword/${user.userId}">Change Password</a>
						
					</div>
				</div>
				<div class="dropdown">
					<button class="dropbtn">Logout</button>
					<div class="dropdown-content">
						<a href="signOut">Sign Out</a>

					</div>
				</div>

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