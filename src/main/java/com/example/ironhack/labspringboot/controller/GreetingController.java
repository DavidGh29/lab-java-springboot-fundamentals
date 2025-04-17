package com.example.ironhack.labspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    @GetMapping
    public String Hello() {
        return "Hello World!";
    }

    @GetMapping("/{name}")
    public String helloToName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return "Sum: " + (num1 + num2);

    }

    @GetMapping("/multiply/{num1}/{num2}")
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        return "Product: " + (num1 * num2);

    }
}
