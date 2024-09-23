package com.dailycodework.dreamshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @GetMapping("/get")
    public String getMethodName(@RequestParam String param) {
        return "Hello";
    }
    
}
