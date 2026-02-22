package com.capg.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.beans.Customer;
import com.capg.beans.Lead;
import com.capg.beans.SalesEmployee;

public class LeadService {
	private EntityManagerFactory emf;
	public LeadService(EntityManagerFactory emf) {
		this.emf=emf;
	}
	public void createLead(String name, String source, String contactInfo) {

	    EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();

	    try {
	        tx.begin();

	        Lead lead = new Lead();
	        lead.setName(name);
	        lead.setSource(source);
	        lead.setContactInfo(Long.parseLong(contactInfo));

	        em.persist(lead);

	        tx.commit();
	    } catch (Exception e) {
	        if (tx.isActive()) tx.rollback();
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void assignLeadToEmployee(int leadId, int empId) {

	    EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();

	    try {
	        tx.begin();

	        Lead lead = em.find(Lead.class, leadId);
	        SalesEmployee emp = em.find(SalesEmployee.class, empId);

	        if (lead == null) {
	            System.out.println("Lead not found");
	            return;
	        }

	        if (emp == null) {
	            System.out.println("Employee not found");
	            return;
	        }

	        lead.setEmployee(emp);

	        tx.commit();
	        System.out.println("Lead assigned successfully");

	    } catch (Exception e) {
	        if (tx.isActive()) tx.rollback();
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	public void convertLeadToCustomer(int leadId) {

	    EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();

	    try {
	        tx.begin();

	        Lead lead = em.find(Lead.class, leadId);

	        Customer customer = new Customer();
	        customer.setName(lead.getName());
	        customer.setPhone(lead.getContactInfo());

	        em.persist(customer);
	        em.remove(lead);

	        tx.commit();
	    } catch (Exception e) {
	        if (tx.isActive()) tx.rollback();
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	}
}
