package com.camunda.demo.process.payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.camunda.zeebe.spring.client.annotation.Deployment;

@Deployment(resources = "classpath:bpmn/**.bpmn")
@SpringBootApplication
public class ProcessPaymentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProcessPaymentsApplication.class, args);
    }
}
