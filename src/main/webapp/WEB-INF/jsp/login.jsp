<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library Management System</title>
</head>
<body>
	<h1>Welcome to LMS</h1>
	<br>
	<form action="login" method="post">
		Name:<input type="text" name="username"> 
		Password:<input type="password" name="password"> 
		<input type="submit" value="Login">
	</form>
	${message}
</body>
</html>