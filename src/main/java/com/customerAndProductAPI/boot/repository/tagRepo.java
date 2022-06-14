package com.customerAndProductAPI.boot.repository;

import com.customerAndProductAPI.boot.model.tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface tagRepo extends JpaRepository<tag,Integer> {
}
