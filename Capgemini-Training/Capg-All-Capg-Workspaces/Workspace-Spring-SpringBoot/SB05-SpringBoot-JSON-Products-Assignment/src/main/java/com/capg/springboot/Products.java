package com.capg.springboot;

import java.io.Serializable;

public class Products implements Serializable{
	private String pid;
	private String pname;
	private double price;
	public Products(String pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public String getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
	
}
