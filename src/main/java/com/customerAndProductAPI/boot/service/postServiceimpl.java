package com.customerAndProductAPI.boot.service;

import com.customerAndProductAPI.boot.dto.postDTO;
import com.customerAndProductAPI.boot.model.post;
import com.customerAndProductAPI.boot.repository.postRepo;
import com.customerAndProductAPI.boot.repository.tagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class postServiceimpl implements postService{

    @Autowired
    postRepo prepo;

    @Autowired
    tagRepo trepo;

    @Override
    public post addpost(post p) {
        return prepo.save(p);
    }

    @Override
    public List<post> getAllPost() {
        return prepo.findAll();
    }
}
