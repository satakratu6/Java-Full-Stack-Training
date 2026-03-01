package com.capg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public boolean addProduct(Product product) {
        return productDAO.insertProduct(product);
    }
}