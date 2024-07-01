package com.lambda.aws.java.handler;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.stereotype.Component;

@Component
public class LambdaRequestHandler extends SpringBootRequestHandler<String, String> {
//public class LambdaRequestHandler implements RequestHandler<String, String> {
//    private LambdaService lambdaService;
//    @Override
//    public String handleRequest(String input, Context context) {
//        System.out.println("handleRequest from RequestHandler "+input);
//        return lambdaService.handleRequest(input);
//    }
}
