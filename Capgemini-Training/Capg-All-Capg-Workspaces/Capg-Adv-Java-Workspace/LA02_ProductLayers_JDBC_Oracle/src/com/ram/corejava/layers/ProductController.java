package com.ram.corejava.layers;
import java.util.*;
//create table book(bookid int,title varchar2(20),price float,grade varchar2(20));
public class ProductController {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter Product Id: ");
		int pid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter product Name: ");
		String pname=sc.nextLine();
		System.out.println("Enter price: ");
		double price=sc.nextDouble();
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter BookID");
		
		ProductService ProductService=new ProductService();
		                        // 100   java  250
		int t=ProductService.addProduct(pid,pname,price);
		
		System.out.println("BookController return value for db  :"+t);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
