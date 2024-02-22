package com.assessment.demo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(String message, HttpStatus httpStatus){
        Map<String,Object> response = new HashMap<>();
        response.put("message",message);
        return new ResponseEntity<>(response,httpStatus);

    }
}
