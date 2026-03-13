package com.coforge.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class Book {
	
//	@Value("${Book.id}")
	private long bookid;
//	@Value("${Book.title}")
	private String title;
//	@Value("${Book.price}")
	private double price;
//	@Value("#{'${Book.authors}'.split(',')}")
	private List<String> authors;
	public Book() {
		super();
	}
	public Book(long bookid, String title, double price, List<String> authors) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.price = price;
		this.authors = authors;
	}
	public long getBookid() {
		return bookid;
	}
	public void setBookid(long bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", price=" + price + ", author=" + authors + "]";
	}
	
	
	

}
