package com.Book.Back.service;

import com.Book.Back.persistence.entities.Books;
import com.Book.Back.persistence.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class BookService {


    @Autowired
    BookRepository bookRepository;

    public void AddBook(Books books) {
        bookRepository.save(books);
    }

    public List<Books> BringAll(){
        return  bookRepository.findAll();
    }

}
