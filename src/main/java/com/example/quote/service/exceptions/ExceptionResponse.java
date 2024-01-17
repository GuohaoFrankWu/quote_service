package com.example.quote.service.exceptions;

public class ExceptionResponse extends RuntimeException {


    public ExceptionResponse(String errMsg, Throwable err){
        super(errMsg, err);
    }


}
