package com.customerAndProductAPI.boot.controller;

import com.customerAndProductAPI.boot.model.tag;
import com.customerAndProductAPI.boot.repository.tagRepo;
import com.customerAndProductAPI.boot.service.postService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tag")
public class tagCOntroller {

    postService service;


    public tagCOntroller(postService service) {
        this.service = service;
    }

    @Autowired
    tagRepo trepo;

    @PostMapping
    public ResponseEntity<tag> addTag(@RequestBody tag t){
        return new ResponseEntity<>(trepo.save(t),HttpStatus.CREATED);
    }

    @GetMapping
    public List<tag> getAllTag(){
        return service.getAllTag();
    }

}
