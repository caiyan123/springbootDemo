package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注意：一定要放在主application目录下建立
 */
@RestController
@RequestMapping
public class HelloWorldController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "The first springboot";
    }
}
