package com.andy.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice throwing ball for 60 minutes";
    }
}
