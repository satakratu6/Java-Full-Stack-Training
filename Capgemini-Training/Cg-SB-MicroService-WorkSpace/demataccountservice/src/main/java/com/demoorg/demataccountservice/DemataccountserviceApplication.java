package com.demoorg.demataccountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
//is a Spring annotation used in microservices to register the application with a service
//discovery server so that other services can find it.
public class DemataccountserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemataccountserviceApplication.class, args);
		System.out.println("Demataccount service server started...");
	}

}
