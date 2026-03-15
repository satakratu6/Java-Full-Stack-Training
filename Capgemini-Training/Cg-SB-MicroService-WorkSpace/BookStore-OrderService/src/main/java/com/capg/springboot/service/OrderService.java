package com.capg.springboot.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.client.BookClient;
import com.capg.springboot.dto.BookDTO;
import com.capg.springboot.dto.OrderDTO;
import com.capg.springboot.entity.Order;
import com.capg.springboot.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private BookClient bookClient;

    // CREATE ORDER
    public Order placeOrder(OrderDTO request) {

        BookDTO book = bookClient.getBookById(request.getBookId());

        if (book.getQuantity() < request.getQuantity()) {
            throw new RuntimeException("Not enough stock available");
        }

        double totalPrice = book.getPrice() * request.getQuantity();

        Order order = new Order();
        order.setBookId(request.getBookId());
        order.setCustomerName(request.getCustomerName());
        order.setQuantity(request.getQuantity());
        order.setTotalPrice(totalPrice);
        order.setStatus("PLACED");
        order.setOrderDate(LocalDate.now());

        return orderRepository.save(order);
    }

    // GET ALL ORDERS
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // GET ORDER BY ID
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    // UPDATE ORDER STATUS
    public Order updateOrderStatus(Long id, String status) {

        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        order.setStatus(status);

        return orderRepository.save(order);
    }

    // DELETE ORDER
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}