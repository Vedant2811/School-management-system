<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student operation</title>
</head>
<body>
	<div align = "center">
		<h1>SELECT YOUR CHOICE </h1>
	<form action="<%=request.getContextPath() %>/StudentOptionServlet" method= "post">
	<button name="action" value= "create">Create Student</button>
	<button name="action" value= "delete">Delete Student</button>
	<button name="action" value= "fetch">Fetch Student</button>
	</form>
	</div>
</body>
</html>