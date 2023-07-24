package com.andy.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice serving for 10 minutes";
    }
}
