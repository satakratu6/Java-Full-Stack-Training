package com.food.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import com.food.dao.CategoryDAO;
import com.food.dao.FoodItemsDAO;
import com.food.entity.Category;
import com.food.entity.FoodItem;

@Service
@Transactional
public class FoodItemService {

    @Autowired
    private FoodItemsDAO foodDAO;

    @Autowired
    private CategoryDAO categoryDAO;

    public void addFoodItem(long cid, String name, double price) {
        Category category = categoryDAO.find(cid);

        FoodItem item = new FoodItem();
        item.setItemName(name);
        item.setPrice(price);
        item.setCategory(category);

        foodDAO.save(item);
    }

    public List<FoodItem> getItemsByCategory(long catId) {
        return foodDAO.findByCategory(catId);
    }

    public void removeFoodItem(int itemId) {
        foodDAO.delete(itemId);
    }
}