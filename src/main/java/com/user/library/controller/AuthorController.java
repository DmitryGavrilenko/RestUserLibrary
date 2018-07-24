package com.user.library.controller;

import com.user.library.model.Author;
import com.user.library.repository.AuthorRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController extends BaseController<Author>{

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
        super.setJpaRepository(authorRepository);
    }
}
