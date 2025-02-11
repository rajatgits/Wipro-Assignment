package com.wipro.controller;

import java.io.IOException;
import java.util.List;

import com.wipro.dao.EmployeeDao;
import com.wipro.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao employeeDao = new EmployeeDao();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String department = request.getParameter("department");
		Employee emp = new Employee(0,name,department);
		employeeDao.addEmployee(emp);
 		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> employees = employeeDao.getEmployees();
		request.setAttribute("employees", employees);
		request.getRequestDispatcher("viewEmployee.jsp").forward(request, response);
	}

}
