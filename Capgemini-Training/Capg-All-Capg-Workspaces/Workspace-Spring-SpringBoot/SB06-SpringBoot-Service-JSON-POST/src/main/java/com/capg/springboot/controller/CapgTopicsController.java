package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapgTopicsController {
	@Autowired
	CapgTopicsService topicService ;
	@RequestMapping("/myController")
	public String display() {
		return "My Controller";
	}
	@RequestMapping("/capgtopics")
	public List<CapgTopics> getAllTopics(){
		return topicService.getAllMyTopics();
	}
	@RequestMapping(method=RequestMethod.POST, value="/capgtopics")
	public void addTopic(@RequestBody CapgTopics topic) {
		topicService.addTopic(topic);
	}
}
