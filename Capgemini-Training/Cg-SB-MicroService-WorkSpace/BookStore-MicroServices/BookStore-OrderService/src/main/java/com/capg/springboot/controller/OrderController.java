package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capg.springboot.dto.OrderDTO;
import com.capg.springboot.entity.Order;
import com.capg.springboot.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    // GET ALL ORDERS
    @GetMapping
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }

    // GET ORDER BY ID
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return service.getOrderById(id);
    }

    // CREATE ORDER
    @PostMapping
    public Order placeOrder(@RequestBody OrderDTO request) {
        return service.placeOrder(request);
    }

    // UPDATE ORDER STATUS
    @PutMapping("/{id}")
    public Order updateOrderStatus(@PathVariable Long id, @RequestBody Order order) {
        return service.updateOrderStatus(id, order.getStatus());
    }

    // DELETE ORDER
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        service.deleteOrder(id);
    }
}