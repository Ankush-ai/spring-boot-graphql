package com.spring.graphql.Spring.boot.with.graphql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.graphql.Spring.boot.with.graphql.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
