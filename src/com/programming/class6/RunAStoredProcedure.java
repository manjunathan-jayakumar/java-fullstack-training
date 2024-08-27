package com.programming.class6;

import java.sql.*;
import java.util.Scanner;
public class RunAStoredProcedure {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/hplus";
    private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "pass@word1";

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement stmt = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your employee id (int) : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Employee name : ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Role : ");
        String role = sc.nextLine();
        System.out.print("Enter Employee City : ");
        String city = sc.nextLine();
        System.out.println("Enter Employee Country : ");
        String country = sc.nextLine();

        try{
            conn = RunAStoredProcedure.getConnection();
            stmt = conn.prepareCall("{call insertEmployee(?,?,?,?,?,?)}");
            stmt.setInt(1,id);
            stmt.setString(2,name);
            stmt.setString(3,role);
            stmt.setString(4,city);
            stmt.setString(5,country);
            stmt.registerOutParameter(6,java.sql.Types.VARCHAR);
            stmt.executeUpdate();
            String result = stmt.getString(6);
            System.out.println("Employee Record saved successfully through Stored Procedure -"+ result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                conn.close();
                sc.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
    static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName(DB_DRIVER_CLASS);
            conn= DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
