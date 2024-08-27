package com.programming.class6;

import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=pass@word1";

        try {
            conn = DriverManager.getConnection(dbURL);
            String sql = "INSERT INTO EMPLOYEE VALUES(?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 17);
            ps.setString(2, "Jamie");
            ps.setString(3, "Lannister");
            ps.setString(4, "GET");

            int rows_affected = ps.executeUpdate();

            String selectSQL = "SELECT * FROM EMPLOYEE WHERE DESIGNATION = ?";
            ps = conn.prepareStatement(selectSQL);
            ps.setString(1, "GET");
            rs = ps.executeQuery();

            System.out.println("ID\tFirst name\tLast name\tDesignation");
            System.out.println("--------------------------------------");

            while(rs.next()) {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (null != conn) {
                System.out.println("conn was not null");
                try {
                    assert rs != null;
                    rs.close();
                    ps.close();
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
