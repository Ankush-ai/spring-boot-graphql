package com.spring.graphql.Spring.boot.with.graphql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.graphql.Spring.boot.with.graphql.Entity.Book;
import com.spring.graphql.Spring.boot.with.graphql.Service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
	@Autowired
	private BookService bookService;

	// create
	@MutationMapping("createBook")
	public Book create(@Argument BookInput book) {
		Book b = new Book();
		b.setTitle(book.getTitle());
		b.setDesc(book.getDesc());
		b.setPrice(book.getPrice());
		b.setAuthor(book.getAuthor());
		b.setPages(book.getPages());
		return this.bookService.create(b);
	}

	@QueryMapping("allbooks")
	public List<Book> getAll() {
		return bookService.getAll();
	}

//get single book
	@QueryMapping("getBook")
	public Book get(@Argument int bookId) {
		return bookService.get(bookId);
	}
}
