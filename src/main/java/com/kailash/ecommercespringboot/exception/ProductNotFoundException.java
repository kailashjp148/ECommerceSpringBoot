package com.kailash.ecommercespringboot.exception;



public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(String message)
    {
        super(message);
    }
}
