<%@page import="com.livetechstudy.lms.springboot.entity.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LMS</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
	text-align: left;
}
</style>
</head>
<body>
	Books Details :
	<br>
	<table>
		<tr>
			<th>BookId</th>
			<th>Book Title</th>
			<th>Book Author</th>
		</tr>

		<%
			List<Book> books = (List<Book>) request.getAttribute("allbooks");
			for (Book book : books) {
		%>
		<tr>
			<td><%=book.getId()%></td>
			<td><%=book.getBookTitle()%></td>
			<td><%=book.getAuthor()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<br>
	<a href="menu">Show Menu </a>
</body>
</html>