package com.brunalima.bookstoremanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public MessageResponseDTO create(@RequestBody Book book){

        return bookService.create(book);
    }
}
