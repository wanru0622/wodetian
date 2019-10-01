package com.ye.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/name")
    public String name(){
        return name;
    }



}
