package com.lambda.aws.java.service;

import org.springframework.stereotype.Service;

@Service
public class LambdaService {
    public String handleRequest(String input){
        System.out.println("handleRequest from service class");
        return "Hello "+input;
    }
}
