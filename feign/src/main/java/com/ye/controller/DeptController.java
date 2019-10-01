package com.ye.controller;


import domain.impl.FeignDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    private FeignDept feignDept;


    @RequestMapping("/index/{id}")
//    @HystrixCommand(fallbackMethod = "fallbackMethod")
    String dept(@PathVariable("id") int id){
        String dept = feignDept.dept(id);
        return dept;
    }


    public String fallbackMethod(){
        return "fail";
    }

}
