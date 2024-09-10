package com.luv2code.springcoredemo.common;

import jdk.jfr.Label;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("Int constructor   "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "mai hu trackcoah";
    }

}
