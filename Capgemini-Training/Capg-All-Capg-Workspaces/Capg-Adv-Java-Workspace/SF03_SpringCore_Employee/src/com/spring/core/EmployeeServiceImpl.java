package com.spring.core;
public class EmployeeServiceImpl implements EmployeeService {

    int id;
    String name;

    public EmployeeServiceImpl() {
    }

    public EmployeeServiceImpl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void allEmployees() {
        System.out.println("Id: " + id + " Name: " + name);
    }
}
