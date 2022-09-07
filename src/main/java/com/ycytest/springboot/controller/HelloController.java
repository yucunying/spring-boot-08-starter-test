package com.ycytest.springboot.controller;

import com.ycytest.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author yu.cunying
 * @Date 2022/9/7
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("sayHello")
    public String sayHello(){
        return helloService.sayHello("haha");
    }
}
