package com.kailash.ecommercespringboot.exception;

import com.kailash.ecommercespringboot.errorResponse.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleProductNotFound(ProductNotFoundException ex)
    {
        ErrorResponse er=ErrorResponse.builder().errorCode(HttpStatus.NOT_FOUND.value()).message(ex.getMessage()).timestamp(LocalDateTime.now()).build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex)
    {
        ErrorResponse er=ErrorResponse.builder().errorCode(HttpStatus.INTERNAL_SERVER_ERROR.value()).message(ex.getMessage()).timestamp(LocalDateTime.now()).build();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(er);
    }
}
