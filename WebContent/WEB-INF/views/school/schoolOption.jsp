<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School operation</title>
</head>
<body>

	<div align = "center">
		<h1>SELECT YOUR CHOICE </h1>
	<form action="<%=request.getContextPath() %>/SchoolOptionServlet" method= "post">
	<button name="action" value= "create">Create School</button>
	<button name="action" value= "delete">Delete School</button>
	<button name="action" value= "fetch">Fetch School</button>
	</form>
	</div>

</body>
</html>