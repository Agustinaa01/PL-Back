package com.Book.Back.controller;

import com.Book.Back.persistence.entities.Books;
import com.Book.Back.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public void AddBook(@RequestBody Books books){
        bookService.AddBook(books);
    }

    @GetMapping("/bringall")
    public ResponseEntity<List<Books>>bringall(){
        return ResponseEntity.ok(bookService.BringAll());
    }


}
