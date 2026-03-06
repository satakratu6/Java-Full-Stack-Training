package com.capg.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CapgTopicsService {
	public List topics=Arrays.asList(new CapgTopics("Spring Boot", "Spring MVC", "Spring"),
									 new CapgTopics("J2SE Technlogies","JDBC","JAVA"),
									 new CapgTopics("UI Technlogies","Angular 6","Angular"));
	
	List<CapgTopics> myTopics=new ArrayList<CapgTopics>(topics);
	public List<CapgTopics> getAllMyTopics(){
		return myTopics;
	}
	public void addTopic(CapgTopics topic) {
		myTopics.add(topic);
	}
}
