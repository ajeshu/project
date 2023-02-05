<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address Form</title>
</head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password],input[type=number] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus, input[type=number]:focus {
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
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: right;
  width: 50%;
}
.main-container{
	background-image: linear-gradient(to bottom right, #7BCCB5, #00827F);
}

/* Add padding to container elements */
.container {
  width:50%;
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
	<form action="addAddress" style="border:1px solid #ccc " method="post">
  <div class="container">
    <h1 style="color: black; text-align: center; ">Add Address</h1>
    
    <hr>

    <label for="houseName" style="color: white;"><b>House Name</b></label>
    <input type="text" placeholder="Enter House Name" name="houseName" required>

    <label for="street" style="color: white;"><b>Street</b></label>
    <input type="text" placeholder="Enter Street" name="street" required>

	<label for="postOffice" style="color: white;"><b>Post Office</b></label>
    <input type="text" placeholder="Enter Post Office" name="postOffice" required>
	
    <label for="district" style="color: white;"><b>District</b></label>
    <input type="text" placeholder="Enter District" name="district" required>
    
    <label for="state" style="color: white;"><b>State</b></label>
    <input type="text" placeholder="Enter State" name="state" required>
    
    <label for="country" style="color: white;"><b>Country</b></label>
    <input type="text" placeholder="Enter Country" name="country" required>
    
    <label for="pinCode" style="color: white;"><b>Pin Code</b></label>
    <input type="number" placeholder="Enter Pin Code" name="pinCode" required>
    
    <div class="clearfix">
      <a href="goBackAdd" ><img alt="" src="/images/backarrow.png" width="50" height="50"></a>
      <button type="submit" class="signupbtn">SUBMIT</button>
    </div>
  
  </div>
</form>
</div>
	
</body>
</html>