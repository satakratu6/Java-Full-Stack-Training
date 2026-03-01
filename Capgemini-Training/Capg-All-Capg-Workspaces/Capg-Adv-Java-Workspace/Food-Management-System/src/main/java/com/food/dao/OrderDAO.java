package com.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.food.entity.Order;

@Repository
public class OrderDAO {

    @PersistenceContext
    private EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    public Order find(int id) {
        return em.find(Order.class, id);
    }

    public void delete(int id) {
        Order order = em.find(Order.class, id);
        if (order != null) em.remove(order);
    }
}