package com.ust.bs.book.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ust.bs.book.dto.*;

@RestController 
@RequestMapping("/cato")
public class Categorycontroller {
	
	//http://localhost:9093/cato/list
	@RequestMapping("/list")
	public Book geetAllData() {
		
		return new Book(1001,"Harry Potter");
	}

}
