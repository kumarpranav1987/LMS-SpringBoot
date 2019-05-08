package com.livetechstudy.lms.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livetechstudy.lms.springboot.entity.Book;

public interface BookRepository extends JpaRepository<Book, String> {
	public List<Book> findByBookTitle(String bookTitle);
}
