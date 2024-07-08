package com.spring.graphql.Spring.boot.with.graphql.Service;

import java.util.List;

import com.spring.graphql.Spring.boot.with.graphql.Entity.Book;

public interface BookService {
	
	//create a book 
	Book create(Book book);
	
	//getAll
	List<Book> getAll();
	
	//getSingleBook
	
	Book get(int bookId);

}
