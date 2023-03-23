<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
	
<!DOCTYPE html>
<html>
	<head>
		<meta chasert="ISO-8859-1" />
		<title>Content Manager</title>
	</head>
	
	<body>
		<h1>Welcome to Content Manager Project</h1>
		<form action="LoginServlet" method="post">
			<label for="login">Login:</label>
			<input type="text" name="login" id="login" />
			<br />
			<label for="pass">Password:</label>
			<input type="password" name="pass" id="pass" />
			<br />
			<input type="submit" value="Enviar!" />
		</form>
	</body>
</html>