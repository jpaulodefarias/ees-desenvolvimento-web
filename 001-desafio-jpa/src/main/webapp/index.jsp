<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="library.entity.Book"%>
<%@ page import="library.persistence.BookManager"%>
<html>
<head>
<title>Library</title>
</head>
<body>
	<h1>Library</h1>
	<h2>New Book:</h2>
	<form action="Book" method="post">
		<label for="title">Title: </label><input type="text" name="title" required="required">
		<label for="author">Author: </label><input type="text" name="author">
		<label for="summary">Summary: </label><input type="text" name="summary">
		<label for="year">Year: </label><input type="text" name="year">
		<br /> <br /> <input type="submit"> <input type="reset">
	</form>
	<hr>
	<h2>Books:</h2>
	<table border="1">
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>Summary</th>
			<th>Year</th>
		</tr>
		<%
			List<Book> books = BookManager.list();
			for (Book book : books) {
		%>
		<tr>
			<td><%=book.getTitle()%></td>
			<td><%=book.getAuthor()%></td>
			<td><%=book.getSummary()%></td>
			<td><%=book.getYear()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
