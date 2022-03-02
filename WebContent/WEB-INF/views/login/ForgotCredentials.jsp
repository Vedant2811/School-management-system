<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credential Input</title>
</head>
<body>

	<h1>hello</h1>

	<br><br><br><br>
	
	<div align="center">
	
	<h1>Forgot Credentials</h1>
	<br><br>
	
		<form action="<%=request.getContextPath() %>/ForgotCredentialServlet" method="post">
		<table style="with=80%">
			
			<tr>
				<th>Mobile Number : </th>
				<th><input type="text" name="mobile"></th>
			</tr>
			
			<tr>
				<td colspan ="1" align="center">
					<input type="submit" value="Enter">
				</td>
			</tr>
			
		</table>

	</form>
	
	</div>
	
	
</body>
</html>