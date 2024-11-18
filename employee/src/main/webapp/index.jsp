<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<form action="send" method="post">

<span style="color:green" >${success}</span>
<span style="color:red"> ${failure}</span>

      <h1>person info</h1>
       
        <label>ID</label><br>
        <input type="number" name="id" id="id" required="required"><br>

		<label>NAME</label><br>
        <input type="text" name="name" id="name" required="required"><br>

 		<label>Phone number</label><br>
        <input type="number" name="number" id="phone" required="required"><br>

       <label>Email</label><br>
        <input type="text" name="email" id="email" required="required"><br>
        
        
        <label>Age</label><br>
        <input type="number" name="age" id="age" required="required"><br>

       
        <label>Sal</label><br>
        <input type="number" name="sal" id="sal" required="required"><br>
        <br>

        <input type="submit" value="send" style="background-color: green">

        </form>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		

</body>
</html>