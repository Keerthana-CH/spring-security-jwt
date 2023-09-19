package com.javabrains.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @RequestMapping("/hello")
    public String sayHello(){
        return ("<h1>Hello Everyone</h1>");
    }
}
