package com.andy.springcore.rest;

import com.andy.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // define a private field for the dependency
    private Coach myCoach;

    // define a setter for a dependency injection
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
