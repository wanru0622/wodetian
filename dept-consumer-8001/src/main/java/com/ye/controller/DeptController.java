package com.ye.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getDept")
    public String getDept(){
        String forObject = restTemplate.getForObject("http://dept/index", String.class);
        return forObject;
    }



}
