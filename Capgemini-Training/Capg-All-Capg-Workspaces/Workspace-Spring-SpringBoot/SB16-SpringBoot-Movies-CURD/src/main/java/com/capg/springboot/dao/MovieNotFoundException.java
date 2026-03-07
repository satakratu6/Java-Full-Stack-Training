package com.capg.springboot.dao;

public class MovieNotFoundException extends RuntimeException {

    public MovieNotFoundException(String msg){
        super(msg);
    }

    public MovieNotFoundException(String msg, Throwable e){
        super(msg, e);
    }
}