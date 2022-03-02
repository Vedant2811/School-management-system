<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgotten data</title>
</head>
<body>

	<%
	
		if(session.getAttribute("mobile")==null){
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("");
			dispatcher.forward(request, response);
			
		}
	
	%>

	<div align="center">
		<br><br><br><br>
		<h1>Student Data</h1>
		<br><br>
		
		<table border = "1">
		<tr>
			
			<th>User name</th>
			<th>Password</th>
			<th>Name</th>
			<th>Mobile Number</th>
			
			
		</tr>
		
		<c:forEach items = "${list}" var = "student">
			<tr>
				<th>${student.username}</th>
				<td>${student.password}</td>
				<td>${student.name}</td>
				<td>${student.mobieNumber}</td>
					
				
			</tr>
			
			
		</c:forEach>
		
	</table>
	
	</div>	
	
</body>
</html>