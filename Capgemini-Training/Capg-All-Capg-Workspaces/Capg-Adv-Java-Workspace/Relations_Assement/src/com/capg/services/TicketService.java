package com.capg.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.beans.Order;
import com.capg.beans.SupportTicket;

public class TicketService {
	private EntityManagerFactory emf;
	public TicketService(EntityManagerFactory emf) {
		this.emf=emf;
	}
	public void raiseTicket(int orderId, String issueDescription) {

	    EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();

	    try {
	        tx.begin();

	        Order order = em.find(Order.class, orderId);

	        SupportTicket ticket = new SupportTicket();
	        ticket.setOrder(order);
	        ticket.setIssue(issueDescription);
	        ticket.setStatus("OPEN");

	        em.persist(ticket);

	        tx.commit();
	        System.out.println("Succesfully added to the supportTicket");
	    } catch (Exception e) {
	        if (tx.isActive()) tx.rollback();
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	}
}
