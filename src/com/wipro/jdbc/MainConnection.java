package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodatabases?useSSL=false","root","ShiyaRajat$1528");
		System.out.println("Connected to Database");
		
		Statement statement = connection.createStatement();
		
		int w = statement.executeUpdate("INSERT INTO student VALUES(1528, 'Rajat Raj')");
		System.out.println(w + "rows added");
		
		connection.close();
	}
}
