package com.lambda.aws.java.config;
import com.lambda.aws.java.service.LambdaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class FunctionConfig {

    @Bean
    public Function<String, String> handleRequest(LambdaService lambdaService) {
        return lambdaService::handleRequest;
    }
}