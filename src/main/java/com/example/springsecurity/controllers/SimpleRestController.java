package com.example.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @GetMapping("/hello")
    public String getHello () {
        return ("<h1>Hello Ceco</h1>");
    }

}
