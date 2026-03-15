package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
