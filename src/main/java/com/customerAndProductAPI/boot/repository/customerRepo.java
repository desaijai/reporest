package com.customerAndProductAPI.boot.repository;

import com.customerAndProductAPI.boot.dto.orderRequest;
import com.customerAndProductAPI.boot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface customerRepo extends JpaRepository<Customer,Integer> {


}
