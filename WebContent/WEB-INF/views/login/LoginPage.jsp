<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here</title>

	<script type="text/javascript">
		function validator(){
			var user=document.getElementById("uname");
			var pass=document.getElementById("pass");
			 
			if(user.value.trim()=="" || pass.value.trim()==""){
				alert("Username / Password is blank, please enter respective field");
				return false;
			}
			else if(pass.value.trim().length<5){
				alert("Password is too short, minimum character is 5");
				return false;
			}
			else{
				return true;
			}
		}
	</script>

</head>
<body>


	<br><br><br><br>
	
	<div align="center">
	
	<h1>Login Page</h1>
	<br><br>
	
		<form onsubmit="return validator()" action="<%=request.getContextPath() %>/LoginPageServlet" method="post">
		<table style="with=80%">
			
			<tr>
				<th>User name : </th>
				<th><input id="uname" type="text" name="username" placeholder="User name"></th>
			</tr>
		
			<tr>
				<th>Password : </th>
				<th><input id="pass" type="password" name="password" placeholder="Password"></th>
			</tr>
			
			<tr>
				<td colspan ="2" align="center">
				</td>
			</tr>
			
		</table>
	
	
 		<a href="/ForgotCredentialsServlet">Forgot Username/Password</a><br><br>
 
		<br><br><br>
			
	<button  type="submit">Submit</button>
	
	<h1>
		<button name="action" value= "back">Return to Registration page</button>
	</h1>
			
	</form>
	
	</div>

</body>
</html>