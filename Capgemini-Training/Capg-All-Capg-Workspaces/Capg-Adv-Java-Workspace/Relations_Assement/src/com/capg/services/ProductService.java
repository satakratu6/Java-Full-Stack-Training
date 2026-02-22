package com.capg.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.beans.Product;

public class ProductService {
	private EntityManagerFactory emf;
	public ProductService(EntityManagerFactory emf) {
		this.emf=emf;
	}
	public void addProduct(String name, double price) {

	    EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();

	    try {
	        tx.begin();

	        Product product = new Product();
	        product.setProductName(name);
	        product.setPrice(price);

	        em.persist(product);

	        tx.commit();
	    } catch (Exception e) {
	        if (tx.isActive()) tx.rollback();
	    } finally {
	        em.close();
	    }
	}
	
}
