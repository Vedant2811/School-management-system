<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select Class Operation</title>
</head>
<body>
	<div align = "center">
		<h1>SELECT YOUR CHOICE </h1>
	<form action="<%=request.getContextPath() %>/ClassOptionServlet" method= "post">
	<button name="action" value= "create">Create Class</button>
	<button name="action" value= "delete">Delete Class</button>
	<button name="action" value= "fetch">Fetch Class</button>
	</form>
	</div>
</body>
</html>