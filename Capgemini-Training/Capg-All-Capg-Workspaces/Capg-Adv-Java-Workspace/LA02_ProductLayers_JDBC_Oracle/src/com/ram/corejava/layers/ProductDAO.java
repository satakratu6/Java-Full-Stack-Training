package com.ram.corejava.layers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {
	int i;            // 100  myjava 100  C
	public int addBook(ProductBean productBean) throws ClassNotFoundException {
		
		System.out.println("Product DAO Layer");
		System.out.println("ProductD :"+productBean.getPid());
		System.out.println("ProductName:"+productBean.getPname());
		System.out.println("Product Price :"+productBean.getPrice());
		try {
		
		
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String userName = "scott"; 
		String password = "satakratu789";	 
		  Class.forName(driver);
			conn = DriverManager.getConnection(url,userName,password);
	        String query="insert into product values(?,?,?,?)";
	        
	       PreparedStatement pstmt=conn.prepareStatement(query);
	        pstmt.setInt(1, productBean.getPid()); //100
	        pstmt.setString(2,productBean.getPname()); //java
	        pstmt.setDouble(3,productBean.getPrice()); //250
	        pstmt.setDouble(4, productBean.getFinalAmount()); //c
	        
	         i= pstmt.executeUpdate();
	        
	      }
	      catch(SQLException e) {
	    	  System.out.println(e);
	      }
		return i;
	}
		
		
}
