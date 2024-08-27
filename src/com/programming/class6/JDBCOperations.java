package com.programming.class6;

import java.sql.*;

public class JDBCOperations {
    // not required after JDBC 4.0
//    static {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch(ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        Connection conn = null;
        String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=pass@word1";
        Statement stmt = null;
        ResultSet rs = null;
        Savepoint sv = null;

        try {
            conn = DriverManager.getConnection(dbURL);
            stmt = conn.createStatement();
            if(conn != null) System.out.println("Connected to database");

            conn.setAutoCommit(false);  // by default, commit flag is true
            int i = 0;

            String checkTable = "SELECT * FROM INFORMATION_SCHEMA.TABLES "+
                    "WHERE TABLE_NAME = 'EMPLOYEE' AND TABLE_SCHEMA = 'HPLUS'";


//            String dropSQL = "DROP TABLE EMPLOYEE";
//            stmt.executeUpdate(dropSQL);

            if(!stmt.executeQuery(checkTable).next()){  // if the resultSet return is empty create table
                String createSQL = "CREATE TABLE EMPLOYEE(" +
                        "ID INT NOT NULL," +
                        "FIRST_NAME VARCHAR(200)," +
                        "LAST_NAME VARCHAR(200)," +
                        "DESIGNATION VARCHAR(50));";
                i = stmt.executeUpdate(createSQL);
                if (i == 0) System.out.println("Table created.");
                else System.out.println("Table not created!!!");
            }

            // insertion
            String insertSQL = "INSERT INTO EMPLOYEE VALUES(" +
                    "14, 'John', 'Arryn', 'MD')";
            i = stmt.executeUpdate(insertSQL);
            if(i != 0) System.out.println("Record Added.");
            else System.out.println("Record could not be added!!!");

            // Update
            String updateQuery = "UPDATE EMPLOYEE SET ID = 12 WHERE FIRST_NAME = 'Sakthi'";
            i = stmt.executeUpdate(updateQuery);
            if(i != 0) System.out.println("record update succeeded.");
            else System.out.println("Update failed.");

            // deletion
            String deleteSQL = "DELETE FROM EMPLOYEE WHERE ID = 11";
            i = stmt.executeUpdate(deleteSQL);
            if (i != 0) System.out.println("deleted record");
            else System.out.println("Deletion failed");

            conn.commit(); // needed for insert, update, delete. since autocommit is off.

            // data retrieval
            String selectSQL = "SELECT * FROM EMPLOYEE";
            rs = stmt.executeQuery(selectSQL);

            while(rs.next()){
                System.out.println("ID: "+ rs.getInt(1));
                System.out.println("First name: "+ rs.getString(2));
                System.out.println("Last name: "+ rs.getString(3));
                System.out.println("Designation: "+ rs.getString(4));
                System.out.println();
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
