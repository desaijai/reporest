package com.customerAndProductAPI.boot.controller;

import com.customerAndProductAPI.boot.dto.postDTO;
import com.customerAndProductAPI.boot.model.post;
import com.customerAndProductAPI.boot.model.tag;
import com.customerAndProductAPI.boot.service.postServiceimpl;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/post")
public class postController {

    postServiceimpl service;

    public postController(postServiceimpl service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<post> savepost(@RequestBody post p1){
        return new ResponseEntity<>(service.addpost(p1), HttpStatus.CREATED);
    }

    @GetMapping
    public List<post> getAllPost(){
        return service.getAllPost();
    }


}
