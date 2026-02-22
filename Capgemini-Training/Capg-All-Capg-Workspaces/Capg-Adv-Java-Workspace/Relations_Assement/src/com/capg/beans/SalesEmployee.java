package com.capg.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="SALES_EMPLOYEE")
public class SalesEmployee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String department;
	
	@OneToMany(mappedBy = "employee")
	private Set<Lead> leads=new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;
	
	@ManyToMany
	@JoinTable(
	    name = "employee_product",
	    joinColumns = @JoinColumn(name = "emp_id"),
	    inverseJoinColumns = @JoinColumn(name = "product_id")
	)
	private Set<Product> products=new HashSet<>();

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Set<Lead> getLeads() {
		return leads;
	}

	public void setLeads(Set<Lead> leads) {
		this.leads = leads;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
}
