package com.example.GradleJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbconnect {
            private static String driver= "Oracle.jdbc.driver.OracleDriver";
            private static String url= "jdbc:mysql://localhost:3306/emps";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName(driver);
			Connection connection= DriverManager.getConnection(url,"root","asck");
			
			PreparedStatement pstat= connection.prepareStatement("insert into product values(?,?,?)");
			pstat.setInt(1, 5);
			pstat.setString(2,"book" );
			pstat.setDouble(3, 40);
			
			int count= pstat.executeUpdate();
			System.out.println(count);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
