package com.example.springannotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

//@Named
@Component
public class Application {
//    @Inject
//    @Named("helloWorldService")

    @Autowired
    @Qualifier("helloKittyService")
    IGreetingService iGreetingService;

    public Application() {
    }

    public Application(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public void start() {
        iGreetingService.sendGreeting();
    }
}