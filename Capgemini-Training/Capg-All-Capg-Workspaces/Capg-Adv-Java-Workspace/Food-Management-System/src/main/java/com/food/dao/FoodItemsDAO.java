package com.food.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.food.entity.FoodItem;

@Repository
public class FoodItemsDAO {

    @PersistenceContext
    private EntityManager em;

    public void save(FoodItem item) {
        em.persist(item);
    }

    public FoodItem find(int id) {
        return em.find(FoodItem.class, id);
    }

    public void delete(int id) {
        FoodItem item = em.find(FoodItem.class, id);
        if (item != null) em.remove(item);
    }

    public List<FoodItem> findByCategory(long catId) {
        TypedQuery<FoodItem> query =
            em.createQuery(
                "SELECT f FROM FoodItem f WHERE f.category.category_id = :cid",
                FoodItem.class
            );

        query.setParameter("cid", catId);
        return query.getResultList();
    }
}