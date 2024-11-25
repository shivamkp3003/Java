package com.cloudthat.productService.exception;

import com.cloudthat.productService.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProductServiceCustomException.class)
    public ResponseEntity<ErrorResponse> handleProductServiceException(ProductServiceCustomException customException){
        return new ResponseEntity<>(
                new ErrorResponse().builder()
                .errorMessage(customException.getMessage())
                .errorCode(customException.getErrorCode())
                .build(), HttpStatus.NOT_FOUND);
    }

}
