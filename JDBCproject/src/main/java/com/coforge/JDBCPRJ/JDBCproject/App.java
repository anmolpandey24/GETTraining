//package com.coforge.JDBCPRJ.JDBCproject;
//
//import java.sql.Connection;
//
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.time.LocalDate;
//import java.util.Scanner;
//
///**
// * Hello world!
// */
//public class App {
//    public static void main(String[] args)throws ClassNotFoundException, SQLException {
//        System.out.println("Hello World!");
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        System.out.println("Driver Loaded");
//        
//        String uname="root";
//        String password="root";
//        String url="jdbc:mysql://localhost:3306/cfgdb";
//        
//        Connection con=DriverManager.getConnection(url,uname,password);
//        System.out.println("Connection established");
//        
////        String query="insert into student values(?,?,?,?,?)";
////        PreparedStatement ps=con.prepareStatement(query);
////        ps.setInt(1, 12);
////        ps.setString(2, "Swati");
////        ps.setDouble(3, 99);
////        ps.setString(4, "5663738383");
////        ps.setString(5, "10-09-2005");
////        LocalDate date=LocalDate.now();
////        Date sqldate=Date.valueOf(date);
////        ps.setDate(5,sqldate);
////        ps.executeUpdate();
////        System.out.println("row inserted");
//        
//        //update code
////        String query="update student set marks=? where stdid=?";
////        PreparedStatement ps=con.prepareStatement(query);
////        ps.setDouble(89, 95);
////        ps.setInt(2, 345);
////        ps.executeUpdate();
////        System.out.println("updation complete");
//        
//        // delete code
////        String query="delete from student where stdid=?";
////        PreparedStatement ps=con.prepareStatement(query)
////        ps.setInt(1,239);
////        ps.executeUpdate();
////        System.out.println("row deleted");
//        
//        Scanner sc=new Scanner(System.in);
//        int choice;
//        
//        while(true) {
//        	System.out.println("MENU:");
//        	System.out.println("1. Insert Data");
//        	System.out.println("2. Update Data");
//        	System.out.println("3. Delete Data");
//        	System.out.println("4. EXIT");
//        }
//        
//        System.out.println("enter mode of CRUD OPERATIONS:");
//        choice=sc.nextInt();
//        
//        if(choice==4) {
//        	System.out.println("exiting... thankyou");
//        	break;
//        }
//        
//        switch(choice) {
//        case 1->insertion(con,sc);
//        case 2->updation(con,sc);
//        case 3->deletion(con,sc);
//        case 4-> {
//        	System.out.println("exiting thankyou....");
//        	return;
//        }
//        	
//        }
//        
//        
//        
//        
//        //INSERTION IN TABLE CITY
//        public static void insertion(Connection conn,Scanner sc) {
//        String query="insert into city values(?,?)";
//        PreparedStatement ps=con.prepareStatement(query);
//        ps.setInt(1, 201310);
//        ps.setString(2, "Noida");
//        ps.executeUpdate();
//        System.out.println("row insertion completed");
//        }
//        
//        //UPDATION IN TABLE CITY
//        public static void updation(Connection conn,Scanner sc) {
//        String query="update city set cityname=? where citypc=?";
//        PreparedStatement ps=con.prepareStatement(query);
//        ps.setInt(1, 300020);
//        ps.setString(2, "Mumbai");
//        ps.executeUpdate();
//        System.out.println("updation completed successfully");
//        }
//        
////        DELETION IN TABLE CITY
//        public static void delete(Connection conn,Scanner sc) {
//        String query="delete from city where citypc=?";
//        PreparedStatement ps=con.prepareStatement(query);
//        ps.setInt(1,201310);
//        ps.executeUpdate();
//        System.out.println("deletion completed");
//        }
//        
//        
//        
//        
//        Statement st=con.createStatement();
//        String query1="select * from city";
//        ResultSet rs=st.executeQuery(query1);
//        
//        System.out.println("******************");
//        ResultSetMetaData rsmd=rs.getMetaData();
//        int count=rsmd.getColumnCount();
//        for(int i=1;i<=count;i++) {
//        	System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
//        }
//        
//        while(rs.next()) {
//        	System.out.println("citypc:" +rs.getInt(rsmd.getColumnName(1)));
//        	System.out.println("cityname:" +rs.getString(rsmd.getColumnName(2)));
////        	System.out.println("Marks:" +rs.getDouble(rsmd.getColumnName(3)));
////        	System.out.println("Mobile number:" +rs.getString(rsmd.getColumnName(4)));
////        	System.out.println("Date Of Birth:" +rs.getDate(rsmd.getColumnName(5)));
////        	
//        	System.out.println("**********************");
        }
//    }
//}

package com.coforge.JDBCPRJ.JDBCproject;

import java.sql.*;
import java.util.Scanner;

public class App {
    private static final String URL  = "jdbc:mysql://localhost:3306/cfgdb";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            // With MySQL Connector/J 8+, this is optional; keeping it is fine.
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found on classpath.");
            return;
        }

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Scanner sc = new Scanner(System.in)) {

            System.out.println("Connection established");

            while (true) {
                System.out.println("\nMENU:");
                System.out.println("1. Insert Data");
                System.out.println("2. Update Data");
                System.out.println("3. Delete Data");
                System.out.println("4. List Data");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = readInt(sc);

                switch (choice) {
                    case 1 -> insertCity(con, sc);
                    case 2 -> updateCity(con, sc);
                    case 3 -> deleteCity(con, sc);
                    case 4 -> listCities(con);
                    case 5 -> {
                        System.out.println("Exiting... thank you!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Safe integer read with prompt retry
    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a number: ");
            sc.next(); // discard invalid token
        }
        return sc.nextInt();
    }

    // INSERTION IN TABLE CITY
    private static void insertCity(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter city postal code (INT): ");
        int pc = readInt(sc);
        sc.nextLine(); // consume newline
        System.out.print("Enter city name: ");
        String name = sc.nextLine();

        String sql = "INSERT INTO city (citypc, cityname) VALUES (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, pc);
            ps.setString(2, name);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) inserted");
        }
    }

    // UPDATION IN TABLE CITY
    private static void updateCity(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter city postal code to update: ");
        int pc = readInt(sc);
        sc.nextLine(); 
        System.out.print("Enter new city name: ");
        String name = sc.nextLine();

        String sql = "UPDATE city SET cityname = ? WHERE citypc = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, pc);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) updated");
        }
    }

    // DELETION IN TABLE CITY
    private static void deleteCity(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter city postal code to delete: ");
        int pc = readInt(sc);

        String sql = "DELETE FROM city WHERE citypc = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, pc);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) deleted");
        }
    }

    // LIST TABLE CITY
    private static void listCities(Connection con) throws SQLException {
        String sql = "SELECT citypc, cityname FROM city";
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            ResultSetMetaData md = rs.getMetaData();
            int cols = md.getColumnCount();

            System.out.println("\n-------------------------------");
            for (int i = 1; i <= cols; i++) {
                System.out.print(md.getColumnName(i) + "\t");
            }
            System.out.println("\n-------------------------------");

            while (rs.next()) {
                System.out.printf("%d\t%s%n", rs.getInt(1), rs.getString(2));
            }
            System.out.println("-------------------------------");
        }
    }
}

