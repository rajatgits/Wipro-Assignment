<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.wipro.model.Student"
	isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
   Student student = (Student)request.getAttribute("rajat");
%>
<%=student%> --%>

	<h2>Student Details</h2>
	<p>
		<strong>Student ID:</strong> ${rajat.id}
	</p>
	<p>
		<strong>Student Name:</strong> ${rajat.name}
	</p>
</body>
</html>