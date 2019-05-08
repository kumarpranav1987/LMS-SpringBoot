<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Enter Book Details:
<form action="addbook" method="post">
Book ID : <input type="text" name="bookId">
<br>
Book Title: <input type="text" name="bookTitle">
<br>
Author : <input type="text" name="author">
<br>
<input type="submit" value="Add Book">
<br>
<br>
<a href="menu">Show Menu </a>
</form>
<br>
</body>
</html>