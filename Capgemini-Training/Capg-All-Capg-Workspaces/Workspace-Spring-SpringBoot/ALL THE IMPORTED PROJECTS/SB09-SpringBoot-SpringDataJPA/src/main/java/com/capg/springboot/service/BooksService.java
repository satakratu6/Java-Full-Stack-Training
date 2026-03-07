package com.capg.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Books;
import com.capg.springboot.repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	BooksRepository booksRepository;
	
	public void addBook(Books book) {
		booksRepository.save(book);
	}
	
	public List<Books> getAllBooks(){
		List<Books> books = new ArrayList<>();
		booksRepository.findAll().forEach(b1 -> books.add(b1));
		
		System.out.println(books);
		
		return books;
	}
	
}
