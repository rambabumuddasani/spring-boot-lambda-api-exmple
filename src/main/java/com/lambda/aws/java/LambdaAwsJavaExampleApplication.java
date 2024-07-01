package com.lambda.aws.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaAwsJavaExampleApplication {

	public static void main(String[] args) {
		System.out.println("LambdaAwsJavaExampleApplication execution started");
		SpringApplication.run(LambdaAwsJavaExampleApplication.class, args);
		System.out.println("LambdaAwsJavaExampleApplication run method execution completed");
	}

}
