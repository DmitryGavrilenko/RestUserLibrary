package com.user.library.controller;

import com.user.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/author")
public class AuthorController extends BaseController {

    @Autowired
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        super(authorRepository);
    }
}
