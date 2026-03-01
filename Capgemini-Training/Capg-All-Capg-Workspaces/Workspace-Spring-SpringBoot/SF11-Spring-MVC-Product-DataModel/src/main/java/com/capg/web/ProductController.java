package com.capg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value="/addProduct.spring", method=RequestMethod.POST)
    public ModelAndView addProduct(
            @RequestParam int productId,
            @RequestParam String name,
            @RequestParam double price) {

        ModelAndView mav = new ModelAndView();

        Product product = new Product();
        product.setProductId(productId);
        product.setName(name);
        product.setPrice(price);

        boolean result = productService.addProduct(product);

        if(result) {
            mav.addObject("productId", productId);
            mav.addObject("name", name);
            mav.addObject("price", price);
            mav.setViewName("/Success.jsp");
        } else {
            mav.setViewName("/Failed.jsp");
        }

        return mav;
    }
}

