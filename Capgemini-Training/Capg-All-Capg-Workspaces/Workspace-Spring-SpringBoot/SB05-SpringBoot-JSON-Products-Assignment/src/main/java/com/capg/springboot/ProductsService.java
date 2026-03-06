package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductsService {
	public List products=Arrays.asList(new Products("9f762f", "Laptop", 9045.5), 
									   new Products("gf682g", "Mobile", 90045.3));
	
	public List<Products> showAllProducts(){
		return products;
	}
}
