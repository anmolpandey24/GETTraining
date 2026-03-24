package com.coforge.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity


public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long authorId;
	private String name;
	private String address;
	
	@Transient
	private int age;
	
	@OneToMany(mappedBy = "author",cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonIgnore
	private List<Book> bookList=new ArrayList<Book>();
	public Author(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
//	helper methods which help to connect the two classes author and book
	
	public void addBook(Book book) {
		bookList.add(book);
		book.setAuthor(this);
	}
	
	public void removeBook(Book book) {
		bookList.remove(book);
		book.setAuthor(null);
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	
	
	
	
	
	
	

}
