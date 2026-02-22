package com.capg.services;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.beans.Customer;
import com.capg.beans.Order;
import com.capg.beans.Product;

public class OrderService {
	private EntityManagerFactory emf;
	public OrderService(EntityManagerFactory emf) {
		this.emf=emf;
	}
	public void placeOrder(int orderCustId, List<Integer> productIds) {

	    EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();

	    try {
	        tx.begin();

	        Customer customer = em.find(Customer.class, orderCustId);

	        Order order = new Order();
	        order.setCustomer(customer);

	        double total = 0;

	        for (Integer pid : productIds) {
	            Product product = em.find(Product.class, pid);
	            order.getProducts().add(product);
	            total += product.getPrice();
	        }

	        order.setTotalAmount(total);

	        em.persist(order);

	        tx.commit();
	    } catch (Exception e) {
	        if (tx.isActive()) tx.rollback();
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	}
}
