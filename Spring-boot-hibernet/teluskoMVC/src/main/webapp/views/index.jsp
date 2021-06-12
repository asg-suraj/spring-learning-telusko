<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot MVC Home Page</title>
</head>
<body>
	hi, Welcome To Boot-App
	Let's have some Action
	
	<form action="add">
	Enter 1st number: <input type="text" name="num1"><br>
	Enter 2nd number: <input type="text" name="num2"><br>
	<input type="submit">
	
	also add some aliens
	
	</form>
	<form action="addAliens">
	Enter ID: <input type="text" name="aId"><br>
	Enter Name: <input type="text" name="aName"><br>
	<input type="submit">
	
	</form>
	
</body>
</html>