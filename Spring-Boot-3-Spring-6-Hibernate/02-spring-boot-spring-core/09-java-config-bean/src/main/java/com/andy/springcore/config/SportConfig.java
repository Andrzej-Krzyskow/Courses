package com.andy.springcore.config;

import com.andy.springcore.common.Coach;
import com.andy.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("swimmer")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
