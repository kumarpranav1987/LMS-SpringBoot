package com.livetechstudy.lms.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.livetechstudy.lms.springboot.entity.Book;
import com.livetechstudy.lms.springboot.repository.BookRepository;

@Controller
@RequestMapping("/secure")
public class LibraryController {
	
	@Autowired
	private BookRepository bookRepo;
	
	@GetMapping("/listallbooks")
	public String listAllBooks(ModelMap model) {
		model.put("allbooks", bookRepo.findAll());
		return "showallbooks";
	}
	
	@GetMapping("/addbook")
	public String showAddBookForm() {
		return "addbook";
	}
	
	@PostMapping("/addbook")
	public String addBook(@RequestParam String bookId,@RequestParam String bookTitle,@RequestParam String author) {
		bookRepo.save(new Book(bookId, bookTitle, author));
		return "menu";
	}
	
	@GetMapping("/searchbookbyidform")
	public String showSearchBookByIdForm() {
		return "searchbookbyid";
	}
	
	@GetMapping("/searchbookbyid")
	public String serachBookById(@RequestParam String bookid,ModelMap model) {
		Book book = bookRepo.findById(bookid).get();
		model.put("foundbook", book);
		return "displaybook";	
	}
	
	@GetMapping("/searchbooksbytitleform")
	public String searchBookByTitleForm() {
		return "searchbookbytitle";
	}
	
	@GetMapping("/searchbooksbytitle")
	public String searchBookByTitle(@RequestParam String booktitle,ModelMap model) {
		List<Book> books = bookRepo.findByBookTitle(booktitle);
		model.put("allbooks",books);
		return "showallbooks";
	}
	@GetMapping("/deletebookbyid")
	public String showBookIdForm() {
		return "deletebookbyid";
	}
	
	@PostMapping("/deletebookbyid")
	public String deleteBookById(@RequestParam String bookid) {
		bookRepo.deleteById(bookid);
		return "menu";
	}
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
}
