package com.andy.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class FootballCouch implements Coach {

    public FootballCouch() {
        System.out.println("In construction: " + getClass().getSimpleName());
    }

    // init method
    @PostConstruct
    public void doPostConstructStuff() {
        System.out.println("In PostConstructStuff(): " + getClass().getSimpleName());
    }

    // destroy method
    @PreDestroy
    public void doCleanUpStuff() {
        System.out.println("In CleanUpStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice free kicks for 30 minutes!!";
    }
}
