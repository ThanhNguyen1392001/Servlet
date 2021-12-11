<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CheckLoginServlet" method = "post">
		<h1>LOGIN</h1>
		User name <input type = "text" name = "username" value = "ntpham"><br>
		Password <input type = "password" name = "password" value = "130901"><br>
		<input type = "submit" name = "submit" value = "Login">
		<input type = "reset" name = "reset" value = "Reset">
	</form>
</body>
</html>