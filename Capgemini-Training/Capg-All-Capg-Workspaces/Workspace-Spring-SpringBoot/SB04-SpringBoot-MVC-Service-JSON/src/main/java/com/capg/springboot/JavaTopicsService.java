package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JavaTopicsService {
	public List topics=Arrays.asList(new JavaTopics("SpringBoot", "Spring MVC", "Spring"),
									 new JavaTopics("JPA", "Hibernate", "JDBC"));
	
	public List<JavaTopics> getAllMyTopics(){
		return topics;
	}
						
}
