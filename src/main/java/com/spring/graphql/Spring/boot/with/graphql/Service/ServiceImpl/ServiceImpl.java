package com.spring.graphql.Spring.boot.with.graphql.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.graphql.Spring.boot.with.graphql.Entity.Book;
import com.spring.graphql.Spring.boot.with.graphql.Repository.BookRepository;
import com.spring.graphql.Spring.boot.with.graphql.Service.BookService;
@Service
public class ServiceImpl implements BookService {

	@Autowired
	private BookRepository BookRepo;

	@Override
	public Book create(Book book) {
		return BookRepo.save(book);
	}

	@Override
	public List<Book> getAll() {
		return BookRepo.findAll();
	}

	@Override
	public Book get(int bookId) {
		return BookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
	}

}
