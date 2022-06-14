package com.customerAndProductAPI.boot.service;

import com.customerAndProductAPI.boot.dto.postDTO;
import com.customerAndProductAPI.boot.model.post;

import java.util.List;

public interface postService {

    public post addpost(post p);

    public List<post> getAllPost();

}
