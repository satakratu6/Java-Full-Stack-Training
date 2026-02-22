package com.capg.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Products_database")
public class Product implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private double price;
	
	@ManyToMany(mappedBy="products")
	private Set<Order> orders=new HashSet<>();
	
	@ManyToMany(mappedBy="products")
	private Set<SalesEmployee> employees=new HashSet<>();

	public long getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public Set<SalesEmployee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<SalesEmployee> employees) {
		this.employees = employees;
	}
	
	@OneToOne(mappedBy = "product")
	private SupportTicket supportTicket;
	
}
