package com.programming.class6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaToSQLConnectivity {

    public static void main(String[] args) {

        Connection conn1 = null;
        Connection conn2 = null;

        try {
            // Method1
//            Class.forName("com.mysql.cj.jdbc.Driver");  // this line not required after JDBC 4.0

            String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=pass@word1";
            conn1 = DriverManager.getConnection(dbURL);
            if(conn1 != null) {
                System.out.println("Connection to database - 1");
            }

            // Method2
            String dbURL2 = "jdbc:mysql://localhost:3306/hplus";
            String username = "root";
            String password = "pass@word1";

            conn2 = DriverManager.getConnection(dbURL2, username, password);

            if(conn2 != null) {
                System.out.println("Connection to database - 2");
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
