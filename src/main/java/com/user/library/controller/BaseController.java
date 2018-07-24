package com.user.library.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class BaseController<E>{


    private JpaRepository jpaRepository;

    public void setJpaRepository(JpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @GetMapping(value =  "/get/{id}")
    public ResponseEntity get(@PathVariable Integer id){

        Optional<E> entity = jpaRepository.findById(id);

        return new ResponseEntity(entity, HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    @Transactional
    public ResponseEntity save(@RequestBody E entity){

        jpaRepository.save(entity);

        return new ResponseEntity(entity, HttpStatus.CREATED);
    }

    @PutMapping(value = "/update")
    @Transactional
    public ResponseEntity update(@RequestBody E entity){

        jpaRepository.save(entity);

        return new ResponseEntity(entity, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    @Transactional
    public ResponseEntity delete(@RequestBody E entity){

        jpaRepository.delete(entity);

        return new ResponseEntity(entity, HttpStatus.OK);
    }

}
