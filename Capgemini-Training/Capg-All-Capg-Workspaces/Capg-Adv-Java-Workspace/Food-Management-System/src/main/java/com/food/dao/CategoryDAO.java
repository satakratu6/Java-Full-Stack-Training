package com.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.food.entity.Category;

@Repository
public class CategoryDAO {

    @PersistenceContext
    private EntityManager em;

    public void save(Category category) {
        em.persist(category);
    }

    public Category find(long cid) {
        return em.find(Category.class, cid);
    }

    public void delete(int id) {
        Category c = em.find(Category.class, id);
        if (c != null) em.remove(c);
    }
}