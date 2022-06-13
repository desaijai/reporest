package com.customerAndProductAPI.boot.controller;

import com.customerAndProductAPI.boot.dto.orderRequest;
import com.customerAndProductAPI.boot.model.Customer;
import com.customerAndProductAPI.boot.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
public class orderController {

    customerService cservice;

    public orderController(customerService cservice) {
        this.cservice = cservice;
    }

    @PostMapping(consumes = {"application/json"})
    public ResponseEntity<Customer> placeOrder(@RequestBody orderRequest or) {
        return new ResponseEntity<>(cservice.placeOrder(or), HttpStatus.CREATED);
    }

    @GetMapping(produces = {"application/json"})
    public List<Customer> getAllCustomer() {
        return cservice.getAllCustomer();
    }

    @GetMapping(value = "{cid}", produces = {"application/json"})
    public ResponseEntity<Customer> getCustomerById(@PathVariable("cid") int cid) {
        return new ResponseEntity<>(cservice.getCustomerById(cid), HttpStatus.OK);
    }

    @PutMapping(value = "{cid}")
    public ResponseEntity<Customer> updateOrder(@PathVariable("cid") int pid, @RequestBody orderRequest or) {
        return new ResponseEntity<>(cservice.updateOrder(pid, or.getCustomer()), HttpStatus.OK);
    }

    @DeleteMapping(value = "{cid}")
    public ResponseEntity<String> removeOrder(@PathVariable("cid") int cid){
        return new ResponseEntity<String>("Customer Deleted Successfully.", HttpStatus.NO_CONTENT);
    }
}
