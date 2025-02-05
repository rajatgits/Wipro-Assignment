package com.wipro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wipro.model.Employee;

public class EmployeeDao {
		public EmployeeDao() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		// add Employee to database
		public void addEmployee(Employee emp) {
			String sql = "INSERT into employee(name,department) values(?,?)";
			try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodatabases?useSSL=false","root","ShiyaRajat$1528");
				PreparedStatement stmt  = conn.prepareStatement(sql)){
				stmt.setString(1, emp.getName());
				stmt.setString(2, emp.getDepartment());
				stmt.executeUpdate();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		//Retrieve employees from database
		public List<Employee> getEmployees() {
			List<Employee> employees  = new ArrayList<>();
			String sql = "SELECT * FROM employee";
			try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodatabases?useSSL=false","root","ShiyaRajat$1528");
					PreparedStatement stmt = conn.prepareStatement(sql);
					ResultSet resultSet = stmt.executeQuery()) {
				while(resultSet.next()) {
					Employee emp = new Employee(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getString("department"));
					employees.add(emp);
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return employees;
	}
}
