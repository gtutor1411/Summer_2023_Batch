package com.busyqa.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Database {

	public static String dbUrl;
	public static String username = "dbuser";
	public static String password = "password";		


	public static String getStringFromDb(String query, String env) throws ClassNotFoundException, SQLException, InterruptedException {

		dbUrl = "https://www.sql-practice.com/";
		String returnVariable = "";
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection(dbUrl, username, password);
		java.sql.Statement stmt = con.createStatement();
		Thread.sleep(1000);
		System.out.println(("Firing Query-->" + query));
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			String id = rs.getString(1);			
			returnVariable = id;
		}
		con.close();		
		return returnVariable;
	}

	public static String getStringFromDb(String query, String env, String username, String password)
			throws ClassNotFoundException, SQLException {

		dbUrl = "";
		String returnVariable = "";
		Class.forName("com.mysql.cj.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection(dbUrl, username, password);
		java.sql.Statement stmt = con.createStatement();		
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			String id = rs.getString(1);			
			returnVariable = id;
		}
		con.close();		
		return returnVariable;
	}

	public static int getIntFromDb(String query, String env) throws ClassNotFoundException, SQLException {

		dbUrl = "";
		int returnVariable = 0000;
		Class.forName("com.mysql.cj.jdbc.Driverr");
		java.sql.Connection con = DriverManager.getConnection(dbUrl, username, password);
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			int result = rs.getInt(1);			
			returnVariable = result;
		}
		con.close();
		return returnVariable;
	}

	public static int getIntFromDb(String query, String env, String username, String password)
			throws ClassNotFoundException, SQLException {

		dbUrl = "";
		int returnVariable = 0000;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			int result = rs.getInt(1);			
			returnVariable = result;
		}
		con.close();
		return returnVariable;
	}


	public static void insertorDelInDb(String query, String env) throws ClassNotFoundException, SQLException {
		Connection con =null;
		try {
			dbUrl = "";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = con.createStatement();
			System.out.println(("Firing Query-->" + query));
			stmt.executeUpdate(query);			
			con.close();
		} catch (Exception e) {			
			e.printStackTrace();
			con.close();
		}

	}

	public static void insertorDelInDb(String query, String env, String username, String password)
			throws ClassNotFoundException, SQLException {
		try {
			dbUrl = "";
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection(dbUrl, username, password);
			java.sql.Statement stmt = con.createStatement();			
			stmt.executeUpdate(query);		
			con.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}

	}

	

}

