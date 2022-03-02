<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final page</title>
</head>
<body>


	

	YOUR DATA IS BEEN UPDATED OR BEEN RECORDED
	
	<div align = "center">
	
		<form action="<%=request.getContextPath() %>/FinalViewServlet" method= "post">
	
	<br><br>
	<button name="action" value ="back">Back To Main Menu</button> 
	
	</form>
	
	</div>
	
</body>
</html>