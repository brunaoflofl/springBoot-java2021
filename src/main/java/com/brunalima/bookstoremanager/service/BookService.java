package com.brunalima.bookstoremanager.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunalima.bookstoremanager.dto.BookDTO;
import com.brunalima.bookstoremanager.dto.MessageResponseDTO;
import com.brunalima.bookstoremanager.entity.Book;
import com.brunalima.bookstoremanager.mapper.BookMapper;
import com.brunalima.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;
    
    private final BookMapper bookMapper = BookMapper.INSTANCE;
    
    @Autowired
    public BookService(BookRepository bookRepository) {
    	this.bookRepository = bookRepository;
    }
    
    public MessageResponseDTO create(BookDTO bookDTO){

        Book bookToSave = bookMapper.toModel(bookDTO);
        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID" + savedBook.getId())
                .build();
    }

	public BookDTO findById(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		return bookMapper.toDTO(optionalBook.get());
	}

}
