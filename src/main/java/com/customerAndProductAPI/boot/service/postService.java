package com.customerAndProductAPI.boot.service;

import com.customerAndProductAPI.boot.dto.postDTO;
import com.customerAndProductAPI.boot.model.post;
import com.customerAndProductAPI.boot.model.tag;

import java.util.List;

public interface postService {

    public post addpost(post p);

    public List<post> getAllPost();

    public tag addtag(int pid,tag t);

    public List<tag> getAllTag();


}
