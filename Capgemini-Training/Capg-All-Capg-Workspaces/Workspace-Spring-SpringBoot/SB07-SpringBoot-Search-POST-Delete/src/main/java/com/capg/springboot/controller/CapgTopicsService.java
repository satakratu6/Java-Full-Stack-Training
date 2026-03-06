package com.capg.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CapgTopicsService {

    private List<CapgTopics> myTopics = new ArrayList<>(
            Arrays.asList(
                new CapgTopics("Spring Boot", "Spring MVC", "Spring"),
                new CapgTopics("J2SE Technlogies","JDBC","JAVA"),
                new CapgTopics("UI Technlogies","Angular 6","Angular")
            )
    );

    public List<CapgTopics> getAllMyTopics() {
        return myTopics;
    }

    public CapgTopics getTopic(String id) {
        return myTopics.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addTopic(CapgTopics topic) {
        myTopics.add(topic);
    }
    public void deleteTopic(String id) {
        myTopics.removeIf(t -> id.equals(t.getId()));
    }
}