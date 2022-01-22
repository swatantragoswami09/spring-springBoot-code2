package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    
    private FortuneService fortuneService;

    // defien a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }
    
    // define a setter method
    @Autowired
    public void doSomeCrazyStuff(FortuneService thefortuneService){
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        fortuneService=thefortuneService;
    }

    // @Autowired
    // public TennisCoach(FortuneService fortuneService) {
    //     this.fortuneService = fortuneService;
    // }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }


    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    

    
}
