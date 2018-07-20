package com.user.library.controller;


import com.user.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class BookController extends BaseController{

    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        super(bookRepository);
    }
}
