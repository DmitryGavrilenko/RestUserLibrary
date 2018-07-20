package com.user.library.controller;

import com.user.library.repository.BookRepository;
import com.user.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        super(userRepository);
    }

}
