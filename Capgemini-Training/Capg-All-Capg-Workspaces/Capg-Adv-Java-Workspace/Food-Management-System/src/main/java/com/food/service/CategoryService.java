package com.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import com.food.dao.CategoryDAO;
import com.food.entity.Category;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    public void addCategory(String name, String description) {
        Category category = new Category();
        category.setCategoryName(name);
        category.setDescription(description);
        categoryDAO.save(category);
    }
}