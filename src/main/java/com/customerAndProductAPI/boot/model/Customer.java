package com.customerAndProductAPI.boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;

//    @NotEmpty
//    @Size(min = 2,message = "please make sure that customer name grater than 2 character")
    private String cname;

//    @Email
    private String cemail;

//    @NotEmpty(message = "please enter male or female")
    private String cgender;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id",referencedColumnName = "cid")
    private List<Product> products;

}
