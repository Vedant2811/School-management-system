<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

	<div align = "center">
	
	<form action="<%=request.getContextPath() %>/WelcomePageServlet" method="post">
	
		<h2>WELCOME!! to the School Management System Website</h2><br>
		<h3>I have created this website which controls the tasks of <br></h3>		
		<h3>(1.) Insertion</h3><br>
		<h3>(2.) Deletion</h3><br>
		<h3>(3.) Updation</h3><br>
						<h2>of Student, Class and School</h2><br>
		
		
		<h2>Click Here to</h2><button type="submit"><h2>Sumbit</h2></button>
		</form>
	</div>

</body>
</html>