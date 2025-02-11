package com.wipro;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegistrationServlet
 */
@WebServlet("/StudentRegistrationServlet")
public class StudentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("sid"));
		String name = request.getParameter("sname");
		
		try {
			PrintWriter pw = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodatabases?useSSL=false","root","ShiyaRajat$1528");
			PreparedStatement ps = connection.prepareStatement("INSERT into student VALUES(?, ?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			int x = ps.executeUpdate();
			
			if(x > 0) {
				pw.println("Registered");
			} else {
				pw.println("Invalid");
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
