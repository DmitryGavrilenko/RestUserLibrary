package com.user.library.controller;

import com.user.library.model.Book;
import com.user.library.repository.BookRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class BaseController {


    private JpaRepository jpaRepository;

    public void setJpaRepository(JpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @GetMapping(value =  "/get/{id}")
    public ResponseEntity get(@PathVariable Integer id){

        Optional<Book> t = jpaRepository.findById(id);

        return new ResponseEntity(t, HttpStatus.OK);
    }


    @PostMapping(value = "/save/")
    public ResponseEntity save(@RequestBody Book t){

        jpaRepository.save(t);

        return new ResponseEntity(t, HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/")
    public ResponseEntity update(@RequestBody Book t){

        jpaRepository.save(t);

        return new ResponseEntity(t, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/")
    public ResponseEntity delete(@RequestBody Book t){

        jpaRepository.delete(t);

        return new ResponseEntity(t, HttpStatus.OK);
    }

}
