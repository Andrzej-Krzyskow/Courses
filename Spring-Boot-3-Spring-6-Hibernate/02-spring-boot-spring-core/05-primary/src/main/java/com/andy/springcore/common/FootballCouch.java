package com.andy.springcore.common;

import com.andy.springcore.common.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCouch implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice free kicks for 30 minutes!!";
    }
}
