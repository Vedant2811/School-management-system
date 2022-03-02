<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">

	<form action="<%=request.getContextPath()%>/ConfirmDelete" method ="post">
	
	<br><br><br>
	
	
		<h1>Confirmation for deletion...</h1>
		
		<table>
		
			<tr>
			
				<th>Confirm Class Code : </th>
				<td><input type="text" name="classcode"></td>
			
			</tr>
		
		</table>
		
		<input type="submit" name="Confirm">
		
		
		</form>
	
	</div>

</body>
</html>