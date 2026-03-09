package com.ust.bs.book.dto;

public class Rating {
	private int bookId;
	private int rating;
	public Rating() {
		
	}
	public Rating(int bookId, int rating) {
		super();
		this.bookId = bookId;
		this.rating = rating;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
