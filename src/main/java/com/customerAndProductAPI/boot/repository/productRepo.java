package com.customerAndProductAPI.boot.repository;

import com.customerAndProductAPI.boot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepo extends JpaRepository<Product,Integer> {
}
