<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<script src='https://kit.fontawesome.com/a076d05399.js'
	crossorigin='anonymous'></script>

<title>Confirm Drop Me</title>

<style>
.img1 {
	position: relative;
	margin-left: 57%;
	margin-top: 10%;
	overflow: hidden;
}

.transbox {
	padding: 40px;
	/*width: 75%;*/
	background-color: #e6fffa;
	/*border: 1px solid black;*/
	border-radius: 10px;
	opacity: 0.7;
}

.box {
	width: 75%;
	position: absolute;
	margin-left: 12%;
	margin-bottom: 20%
}
body  {
           background-image: url("design/img/img5.jpg");
           background-color: #cccccc;
           background-size: cover;
           background-attachment: fixed;
         }
</style>
</head>
<body>

	<div class="w3-container w3-teal"></div>
		<div class="w3-container w3-teal">
		<div class="w3-container w3-teal"></div>
		<div class="w3-container">
			<img width="15%" height="10%" src="design/img/DropME.png">
		</div>
		
		</div>
	<br>

	<a href="home.jsp" button type="button" class="btn btn-outline-secondary"><i
		class='fas fa-arrow-left' style='font-size: 24px'></i>
		</button></a>

	<div class="box">
		<div class="transbox">
		
		 <h1><center>Our Vehicle Coming Soon....... </center></h1>



        </div>
    </div>
		
			<br> <br>
		

	
	<br>
	<br>
	<br>
	<br>
	<br>
	
	<center>
	 <b><a href="Payment.jsp"><input type="submit" name="submit" value="Confirm"></a></b>
	  <b><a href="home.jsp"><input type="submit" name="submit" value="Ignore"></a></b>
	  
	  </center>
</body>
</html>