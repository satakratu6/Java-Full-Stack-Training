package com.ust.bs.book.dto;

public class Book {
	private int bookId;
	private String bookName;
	private int rating;
	public Book() {
		
	}
	public Book(int bookId, String bookName, int rating) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.rating = rating;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
