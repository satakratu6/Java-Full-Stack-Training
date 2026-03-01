package com.capg.web;

import java.sql.*;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

    public boolean insertProduct(Product product) {

        boolean status = false;

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "scott",
                    "satakratu789");

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO products VALUES(?,?,?)");

            ps.setInt(1, product.getProductId());
            ps.setString(2, product.getName());
            ps.setDouble(3, product.getPrice());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                status = true;
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}