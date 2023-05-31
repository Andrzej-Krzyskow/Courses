package com.andy.springcore.rest;

import com.andy.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // define a private field for the dependency
    private Coach myCoach;
    private Coach secondCoach;

    // define a constructor for a dependency injection
    @Autowired
    public Controller(
            @Qualifier("tennisCoach") Coach theCoach,
            @Qualifier("tennisCoach") Coach theSecondCoach) {
        System.out.println("In construction: " + getClass().getSimpleName());
        myCoach = theCoach;
        secondCoach = theSecondCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == secondCoach --> " + (myCoach == secondCoach);
    }

}
