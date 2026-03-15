package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class BookStoreBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreBookServiceApplication.class, args);
		System.out.println("Book Service server started");
	}

}
