package com.busyqa.tests;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class TestingFile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String dbHost="https://www.sql-practice.com/";
		String dbUserName="admin";
		String dbPassword="password";
		String query = "Select first_name from patients";
		
		Class.forName("com.mysql.jdbc.Driver");	//type of DB	
		java.sql.Connection con  = DriverManager.getConnection(dbHost,dbUserName,dbPassword);
		java.sql.Statement  stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			String column1 = rs.getString(0);			
		}
		con.close();
		
	}

}
