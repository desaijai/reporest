package com.customerAndProductAPI.boot.repository;

import com.customerAndProductAPI.boot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepo extends JpaRepository<Book,Integer> {
}
