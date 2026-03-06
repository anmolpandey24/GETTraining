package com.coforge.JDBCprocedures.JDBCPROCEDURESAPP;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args ) throws ClassNotFoundException,SQLException{
        System.out.println("Hello World!");
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        
        String uname="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/cfgdb";
        
        Connection con=DriverManager.getConnection(url,uname,password);
        System.out.println("Connection established");
        
        String query="{call get_All_Students}";
        CallableStatement cs=con.prepareCall(query);
        
        ResultSet rs=cs.executeQuery();
        System.out.println("Student data");
        
        System.out.println("******************");
        ResultSetMetaData rsmd=rs.getMetaData();
        int count=rsmd.getColumnCount();
        for(int i=1;i<=count;i++) {
        	System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
        }
        
        while(rs.next()) {
        	System.out.println("stdid:" +rs.getInt(rsmd.getColumnName(1)));
        	System.out.println("stdname:" +rs.getString(rsmd.getColumnName(2)));
        	System.out.println("marks:" +rs.getDouble(rsmd.getColumnName(3)));
        	System.out.println("mobile:" +rs.getString(rsmd.getColumnName(4)));
        	System.out.println("dateofbirth:" +rs.getString(rsmd.getColumnName(5)));
        	
        	System.out.println("**********************");
        }
    }
}
