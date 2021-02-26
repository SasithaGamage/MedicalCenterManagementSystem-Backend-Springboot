<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addOrder">
		<input type = "text" name = "oId">
		<input type = "text" name = "oName">
		<input type = "text" name = "productName">
		<input type = "text" name = "qty">
		<input type = "submit">
	
	</form><br>
	
	<form action="getOrder">
		<input type = "text" name = "oId">

		<input type = "submit">
	
	</form>
	
	${orderss}
	

</body>
</html>