package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetNextExample {

    public static void main(String[] args) {

        Connection conn = null;

        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String userName = "scott";
        String password = "satakratu789";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, password);
            try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from  Employeeinfo1");

            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString("ename"));
                System.out.println(rs.getDouble(3));
            } } catch(SQLException e) {
            	System.out.println(e);
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
