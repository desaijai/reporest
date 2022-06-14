package com.customerAndProductAPI.boot.repository;

import com.customerAndProductAPI.boot.model.post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface postRepo extends JpaRepository<post,Integer> {
}
