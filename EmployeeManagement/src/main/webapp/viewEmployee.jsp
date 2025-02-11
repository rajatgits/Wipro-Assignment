<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List,com.wipro.model.Employee"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View employee</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Department</th>
		</tr>
		
		<%
			List<Employee> employees = (List<Employee>)request.getAttribute("employees");
			if(employees != null) {
				for(Employee emp : employees) {
					%>
						<tr>
							<td><%=emp.getId() %></td>
							<td><%=emp.getName() %></td>
							<td><%=emp.getDepartment() %></td>
						</tr>
					<%
				}
			}
		%>
	</table>
</body>
</html>