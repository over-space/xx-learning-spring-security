package com.learning.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lifang
 * @since 2020/12/1
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/get")
    public String get(){
        return "hello world!!!";
    }

}
