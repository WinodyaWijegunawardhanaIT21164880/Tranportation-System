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

<title>Contact-GoRent</title>

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
		
			<h1>Contact Us </h1>

		</div>
	<br>

	<a href="home.jsp" button type="button" class="btn btn-outline-secondary"><i
		class='fas fa-arrow-left' style='font-size: 24px'></i>
		
		</a>

	<div class="box">
		<div class="transbox">
		</div>
		
		 <!--contact section start-->
    <div class="contact-section">
        <div class="contact-info">
            <div><a href="https://www.google.com/maps/place/Drop Me(PVT)+LTD/@6.8950719,79.9208737,17z/data=!3m1!4b1!4m5!3m4!1s0x3ae250abb96a782f:0xf5d8ea3757fd4667!8m2!3d6.8950719!4d79.9230624"><i class="fa fa-map-marker"></i> Pannipitiya Rd, Battaramulla 10120, Sri Lanka</a></div>

            <div>
                <a href="https://www.gmail.com/"><i class="fa fa-envelope"></i>dropme@gmail.com</a>
            </div>

            <div>
                <i class="fa fa-phone"></i>011 345 7890
            </div>

            <div>
                <i class="fa fa-clock"></i> Mon - Fri 8.00am to 6.00p.m
            </div>
        </div>

        <div class="contact-form">
            <h2>Contact Us</h2>

            <form method="post" action="./php/contact.php">



                <label class="label">Name:</label><br>
                <input type="text" name="name" class="text-box" placeholder="Your Name" required><br>

                <label class="label">Contact Number:</label><br>
                <input type="text" name="contact" class="text-box " placeholder="Your Contact Number " required><br>


                <label class="label ">E-mail:</label><br>
                <input type="text" name="email" class="text-box " placeholder="Your E-mail " required><br>

                <label class="label ">Message:</label><br>
                <textarea name="message" rows="5 " placeholder="Your Message" required></textarea>


                <button type="submit" class="send-btn ">Submit</button>

            </form>




    

	
	<br>
	<br>
	<br>
	<br>
	<br>
</body>
</html>