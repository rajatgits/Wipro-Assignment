package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainStatic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodatabases?useSSL=false","root","ShiyaRajat$1528");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from student");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
		}
		connection.close();
	}
}
