package com.coforge.JDBCprocedures.JDBCPROCEDURESAPP;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Calculator {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        System.out.println("Driver Loaded");
	        
	        String uname="root";
	        String password="root";
	        String url="jdbc:mysql://localhost:3306/cfgdb";
	        
	        Connection con=DriverManager.getConnection(url,uname,password);
	        System.out.println("Connection established");
	        
	        String query="{call add_numbers(?,?,?)}";
	        CallableStatement cs=con.prepareCall(query);
	        cs.setInt(1, 34);
	        cs.setInt(2, 35);
	        cs.registerOutParameter(3, Types.INTEGER);
	        
	        cs.execute();
	        int sum=cs.getInt(3);
	        System.out.println("Addition of two numbers: "+sum);
	        
	}

}
