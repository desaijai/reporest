package com.customerAndProductAPI.boot.service;

import com.customerAndProductAPI.boot.Exception.resourceNotFound;
import com.customerAndProductAPI.boot.dto.orderRequest;
import com.customerAndProductAPI.boot.model.Customer;
import com.customerAndProductAPI.boot.repository.customerRepo;
import com.customerAndProductAPI.boot.repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class customerServiceimpl implements customerService {

    @Autowired
    private customerRepo crepo;

    @Autowired
    private productRepo prepo;

    @Override
    public Customer placeOrder(orderRequest or) {
        return crepo.save(or.getCustomer());
    }

    @Override
    public List<Customer> getAllCustomer() {
        return crepo.findAll();
    }

    @Override
    public Customer getCustomerById(int cid) {
        return crepo.findById(cid).orElseThrow(() -> new resourceNotFound("customer", "cid", cid));
    }

    @Override
    public Customer updateOrder(int cid, Customer or) {
        Customer customer = crepo.findById(cid).orElseThrow(() -> new resourceNotFound("Customer", "cid", cid));
        customer.setCname(or.getCname());
        customer.setCemail(or.getCemail());
        customer.setCgender(or.getCgender());
        customer.setProducts(or.getProducts());

        crepo.save(customer);

        return customer;
    }

    @Override
    public void removeOrder(int cid) {
        Customer customer = crepo.findById(cid).orElseThrow(() -> new resourceNotFound("customer", "cid :", cid));
        crepo.delete(customer);
    }

}
