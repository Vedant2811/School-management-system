<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select</title>
</head>
<body>

	<%
	
		if(session.getAttribute("username")==null){
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/login/LoginPage.jsp");
			dispatcher.forward(request, response);
			
		}
	
	%>

	<div align = "center">
		<h1>SELECT YOUR CHOICE </h1>
	<form action="<%=request.getContextPath() %>/FirstViewServlet" method= "post">
	<button name="action" value= "student">STUDENT</button>
	<button name="action" value= "class">CLASS</button>
	<button name="action" value= "school">SCHOOL</button>
	</form>
	</div>
	
</body>
</html>