<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AlienHome</title>
</head>
<body>
	<form action="addAlien">
		<input type = "text" name = "aId">
		<input type  = "text" name = "aName">
		<input type = "text" name = "lang">
		<input type = "submit">
	
	</form>
	
	<form action="getAlien">
		<input type = "text" name = "aId">
		
		<input type = "submit">
	
	</form>
</body>
</html>