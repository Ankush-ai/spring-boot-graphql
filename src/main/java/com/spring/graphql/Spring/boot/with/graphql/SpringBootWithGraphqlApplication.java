package com.spring.graphql.Spring.boot.with.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.graphql.Spring.boot.with.graphql.Entity.Book;
import com.spring.graphql.Spring.boot.with.graphql.Service.BookService;

@SpringBootApplication
public class SpringBootWithGraphqlApplication implements CommandLineRunner {
	
	@Autowired
	
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithGraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setDesc("For learning java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("XYZ");

		Book b2 = new Book();
		b2.setTitle("Think Java");
		b2.setDesc("For learning java");
		b2.setPages(3000);
		b2.setPrice(5000);
		b2.setAuthor("ABC");

		Book b3 = new Book();
		b3.setTitle("Head first to java");
		b3.setDesc("For starting java concepts");
		b3.setPages(1000);
		b3.setPrice(2000);
		b3.setAuthor("PQR");

		this.bookService.create(b1);
        this.bookService.create(b2);
        this.bookService.create(b3);

	}

}
