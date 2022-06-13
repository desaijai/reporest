package com.customerAndProductAPI.boot.service;

import com.customerAndProductAPI.boot.dto.orderRequest;
import com.customerAndProductAPI.boot.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

public interface customerService {

    public Customer placeOrder(orderRequest or);

    public List<Customer> getAllCustomer();

    public Customer getCustomerById(int cid);

    public Customer updateOrder(int cid,Customer or);

    public void removeOrder(int cid);

}
