<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add employee</title>
</head>
<body>
	<form action="EmployeeServlet" method="post">
		Enter name : <input type="text" name="name" required></br>
		Enter department : <input type="text" name="department"></br>
	<input type="submit" value="Add">
	</form>
</body>
</html>