package com.coforge.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.beans.Book;
import com.coforge.beans.Order;

@Configuration

public class BookOrderConfig {
	
	@Bean(name="ord")
	public Order getOrderBean() {
		return new Order(345,3,2000.0,getBookBean());
	}
	
	@Bean(name="book")
	public Book getBookBean() {
		
		String authArr[]= {"Anmol","rajat","vikky"};
		
		List<String> authorList=Arrays.asList(authArr);
		
		Book b=new Book(123,"JavaTutorials",600.0,authorList);
		return b;
		
	}

}
