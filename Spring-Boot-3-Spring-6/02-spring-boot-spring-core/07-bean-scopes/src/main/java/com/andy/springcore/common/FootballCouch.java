package com.andy.springcore.common;

import com.andy.springcore.common.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FootballCouch implements Coach {

    public FootballCouch() {
        System.out.println("In construction: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice free kicks for 30 minutes!!";
    }
}
