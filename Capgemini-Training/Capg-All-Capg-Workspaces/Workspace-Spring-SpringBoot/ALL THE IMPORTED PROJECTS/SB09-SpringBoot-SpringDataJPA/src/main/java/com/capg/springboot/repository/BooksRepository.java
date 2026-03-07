package com.capg.springboot.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.springboot.entity.Books;


@Repository
public interface BooksRepository extends CrudRepository<Books,Integer> {

}
