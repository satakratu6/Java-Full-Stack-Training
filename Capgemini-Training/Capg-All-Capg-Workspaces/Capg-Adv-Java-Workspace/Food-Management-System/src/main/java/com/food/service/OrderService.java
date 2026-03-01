package com.food.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import com.food.dao.FoodItemsDAO;
import com.food.dao.OrderDAO;
import com.food.entity.FoodItem;
import com.food.entity.Order;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private FoodItemsDAO foodDAO;

    public void placeOrder(List<Integer> foodItemIds, String customerName) {

        Order order = new Order();
        order.setCustomerName(customerName);

        for (int id : foodItemIds) {
            FoodItem item = foodDAO.find(id);

            // Add to order
            order.getFoodItems().add(item);

            // VERY IMPORTANT: add order to food item
            item.getOrders().add(order);
        }

        orderDAO.save(order);
    }

    public double calculateTotal(int orderId) {

        Order order = orderDAO.find(orderId);
        double total = 0;

        for (FoodItem item : order.getFoodItems()) {
            total += item.getPrice();
        }

        return total;
    }
}