package com.livetechstudy.lms.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private String id;
	private String bookTitle;
	private String author;

	public Book() {
	}

	public Book(String id, String bookTitle, String author) {
		this.id = id;
		this.bookTitle = bookTitle;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookTitle=" + bookTitle + ", author=" + author + "]";
	}	
}
