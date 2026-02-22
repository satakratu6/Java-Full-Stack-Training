package com.capg.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.beans.Address;
import com.capg.beans.Customer;

public class CustomerService {
	private EntityManagerFactory emf;
	public CustomerService(EntityManagerFactory emf) {
		this.emf=emf;
	}
	public void registerCustomer(String name, String email, String phone) {

	    EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();

	    try {
	        tx.begin();

	        Customer customer = new Customer();
	        customer.setName(name);
	        customer.setEmail(email);
	        customer.setPhone(Long.parseLong(phone));

	        em.persist(customer);

	        tx.commit();
	        System.out.println("Customer id: "+customer.getCustomerId()+" sucessfully registered");
	        
	        
	        
	    } catch (Exception e) {
	        if (tx.isActive()) tx.rollback();
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	}
	public void addAddressToCustomer(int customerId, Address address) {

	    EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();

	    try {
	        tx.begin();

	        Customer customer = em.find(Customer.class, customerId);

	        if (customer == null) {
	            System.out.println("Customer not found!");
	            return;
	        }

	        customer.setAddress(address);
	        address.setCustomer(customer);

	        tx.commit();

	        System.out.println("Address successfully added");

	    } catch (Exception e) {
	        if (tx.isActive()) tx.rollback();
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	}
}
