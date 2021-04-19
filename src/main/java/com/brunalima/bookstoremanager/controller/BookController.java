package com.brunalima.bookstoremanager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunalima.bookstoremanager.dto.BookDTO;
import com.brunalima.bookstoremanager.dto.MessageResponseDTO;
import com.brunalima.bookstoremanager.entity.Book;
import com.brunalima.bookstoremanager.repository.BookRepository;
import com.brunalima.bookstoremanager.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){

        this.bookService = bookService;

    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){

        return bookService.create(bookDTO);
    }
    
    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id) {
    	return bookService.findById(id);
    }
}
