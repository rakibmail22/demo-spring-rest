package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bashir
 * @since 6/3/21.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }
}