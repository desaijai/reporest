package com.customerAndProductAPI.boot.dto;

import com.customerAndProductAPI.boot.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class orderRequest {

    @Autowired
    private Customer customer;

}
