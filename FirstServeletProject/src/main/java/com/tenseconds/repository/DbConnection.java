package com.tenseconds.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getDbConnection()  {
		
		Connection connection;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drivers are loaded");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/nmitdatabase","root","123456");
			System.out.println("connection is established");
			
			return connection;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}
	
}
