package com.capg.java;

 

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductServiceJUnitTest {

    @Test
    public void testProductServices() {

        // Load Spring Container manually (NO annotations)
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get beans
        ProductService p1 =
                (ProductService) context.getBean("productService1");

        ProductService p2 =
                (ProductService) context.getBean("productService2");
        
        assertNotNull(p1);
        assertNotNull(p2);

        // Call methods
        p1.allProducts();
        p2.allProducts();
        
        

       
        
    }
}
