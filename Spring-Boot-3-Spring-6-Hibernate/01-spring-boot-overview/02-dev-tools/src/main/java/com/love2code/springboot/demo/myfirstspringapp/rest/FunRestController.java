package com.love2code.springboot.demo.myfirstspringapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns "Hello World!"
    @GetMapping("/")
    public String sayHello(){
        return "Hello, World!";
    }

    // expose new endpoint for 'workout'
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 10k!";
    }


    // expose new endpoint for 'fortune'
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "I got 10K";
    }
}
