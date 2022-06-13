package com.customerAndProductAPI.boot.Exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.swing.*;

@Data
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class resourceNotFound extends RuntimeException {

    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public resourceNotFound(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName,fieldName,fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }


}
