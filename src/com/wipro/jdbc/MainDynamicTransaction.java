package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainDynamicTransaction {
    public static void main(String[] args) throws ClassNotFoundException, SQLException { 
        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodatabases?useSSL=false","root","ShiyaRajat$1528");
		PreparedStatement ps = connection.prepareStatement("update ? set balance = balance + ? where accno = ?");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id : ");
		int a = scanner.nextInt();
		System.out.println("Enter the Name : ");
		String b = scanner.next();
		ps.setInt(1, a);
		ps.setString(2, b);
		int ans = ps.executeUpdate();
		System.out.println(ans + "row inserted");
		connection.close();
    }    
}
