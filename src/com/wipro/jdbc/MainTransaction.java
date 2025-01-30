package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTransaction {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodatabases?useSSL=false","root","ShiyaRajat$1528");
		connection.setAutoCommit(false);
		Statement statement = connection.createStatement();
		int a = statement.executeUpdate("update a set balance = balance - 100000 where accno=1");
		int b = statement.executeUpdate("update b set balance = balance + 100000 where accno=2");
		if(a > 0 && b > 0) {
			connection.commit();
			System.out.println("Balance transferred");
		} else {
			connection.rollback();
			System.out.println("Account not found");
		}
		connection.close();
	}
}
