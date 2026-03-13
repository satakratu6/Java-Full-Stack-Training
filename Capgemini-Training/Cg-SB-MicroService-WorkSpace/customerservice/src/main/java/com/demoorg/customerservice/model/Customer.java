package com.demoorg.customerservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_1")
public class Customer {
	 @Id
	    @Column(name="CID")
	    private int cId;

	    @Column(name="NAME")
	    private String name;

	    @Column(name="SAL")
	    private double sal;

	public int getCId() {
		return cId;
	}

	public void setCId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
