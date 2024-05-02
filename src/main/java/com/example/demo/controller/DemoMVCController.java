package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoMVCController {

    @GetMapping("/")
    public String displayMessage() {
        return "Hello Ynov";
    }
}
