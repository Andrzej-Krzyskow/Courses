package com.love2code.springboot.demo.myfirstspringapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: coach.name, team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return String.format("Coach: %s, Team name: %s",coachName,teamName);
    }

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
