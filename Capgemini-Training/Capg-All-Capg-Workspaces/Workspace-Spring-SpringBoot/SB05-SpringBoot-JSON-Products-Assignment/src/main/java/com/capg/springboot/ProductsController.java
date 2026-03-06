package com.capg.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
@Autowired
private ProductsService productsService;
@RequestMapping("login.spring")
public String isValid() {
	return "Welcome to Spring Boot application";
}
@RequestMapping("/show-products")
public List showAllProducts() {
	return productsService.showAllProducts();
}
}
