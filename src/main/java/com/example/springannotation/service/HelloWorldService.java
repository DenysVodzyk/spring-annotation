package com.example.springannotation.service;

import org.springframework.stereotype.Component;

import javax.inject.Named;

//@Named
@Component
public class HelloWorldService implements IGreetingService {
    private String message;

    public HelloWorldService() {
        this.message = "";
    }

    public HelloWorldService(String message) {
        this.message = message;
    }

    public void sendGreeting() {
        System.out.println("Hello, world!" + message);
    }
}
