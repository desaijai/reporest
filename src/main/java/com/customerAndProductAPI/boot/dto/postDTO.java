package com.customerAndProductAPI.boot.dto;

import com.customerAndProductAPI.boot.model.post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class postDTO {

    @Autowired
    post p;

}
