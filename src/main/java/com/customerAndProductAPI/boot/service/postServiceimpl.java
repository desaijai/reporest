package com.customerAndProductAPI.boot.service;

import com.customerAndProductAPI.boot.Exception.resourceNotFound;
import com.customerAndProductAPI.boot.model.post;
import com.customerAndProductAPI.boot.model.tag;
import com.customerAndProductAPI.boot.repository.postRepo;
import com.customerAndProductAPI.boot.repository.tagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Override
    public tag addtag(int pid,tag t) {
         post posts= prepo.findById(pid).orElseThrow(()->new resourceNotFound("tag","tid", pid));
         Set<tag> listoftag=new HashSet<>();
         listoftag.add(t);
         posts.setTags(listoftag);
        return trepo.save(t);
    }

    @Override
    public List<tag> getAllTag() {
        return trepo.findAll();
    }

    //add tag data

}
