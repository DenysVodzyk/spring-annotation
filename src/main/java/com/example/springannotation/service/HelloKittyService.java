package com.example.springannotation.service;

import org.springframework.stereotype.Component;

import javax.inject.Named;

//@Named

@Component
public class HelloKittyService implements IGreetingService {

    public void sendGreeting() {
        System.out.println("Hello, Kitty!");
    }
}
