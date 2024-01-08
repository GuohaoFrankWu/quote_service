package com.example.quote.service.Exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;

public class ResponseEntityErrorException extends RuntimeException {
    private ResponseEntity<ErrorResponse> errorResponse;
    public ResponseEntityErrorException(ResponseEntity<ErrorResponse> errorResponse) {
        this.errorResponse = errorResponse;
    }
    public ResponseEntity<ErrorResponse> getErrorResponse() {
        return errorResponse;
    }
}
