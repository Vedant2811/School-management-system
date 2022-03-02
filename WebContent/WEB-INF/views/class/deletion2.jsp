<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<form action="<%= request.getContextPath() %>/Deletion" method="post">
	<h1>The Class you want to delete cannot be deleted right now, because it contains few students in it.</h1>	
	<h1>Would you like to delete,</h1>
	<button name="action" value="yes">Yes, delete the students too</button>
	<button name="action" value="no">No, don't delete this class</button>
	</form>

</body>
</html>