<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<style type="text/css">
	
	body {
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
	background-color: white;
	border-color: black;

	
}
	</style>
</head>
<body>
<form action="order" method="post">
<h1>Order form</h1>

 <label>Food name</label><br>
        <input type="text" name="name" id="name" required="required"><br>


        <label>Price</label><br>
        <input type="number" name="price" id="price" required="required"><br>

        
        <label>Customer name</label><br>
        <input type="text" name="c_name" id="c_name" required="required"><br>

       
        <label>Phone number</label><br>
        <input type="number" name="phone" id="phone" required="required"><br>

       
        <label>Quantity</label><br>
        <input type="number" name="quantity" id="quantity" required="required"><br>
        <br>

        <input type="submit" value="order" style="background-color: blue">



</form>
 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		

</body>
</html>