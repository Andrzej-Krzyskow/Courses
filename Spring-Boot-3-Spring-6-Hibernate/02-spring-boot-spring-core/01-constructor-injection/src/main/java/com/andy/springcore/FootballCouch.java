package com.andy.springcore;

import org.springframework.stereotype.Component;

@Component
public class FootballCouch implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice free kicks for 30 minutes!!!";
    }
}
