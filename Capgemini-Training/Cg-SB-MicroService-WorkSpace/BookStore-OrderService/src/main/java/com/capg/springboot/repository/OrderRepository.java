package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.springboot.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}