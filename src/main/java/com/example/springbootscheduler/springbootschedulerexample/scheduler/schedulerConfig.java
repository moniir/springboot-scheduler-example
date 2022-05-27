package com.example.springbootscheduler.springbootschedulerexample.scheduler;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;

@Configuration
@EnableScheduling
public class schedulerConfig {

    @Scheduled(fixedDelay = 3000)
    public void sendMessage(){
        System.out.println("Hey, I am scheduled with fixed delay method");
    }


    @Scheduled(fixedDelay = 3000, initialDelay = 8000)
    public void sendMessageWithInitialDelay(){
        System.out.println("Hey, I am scheduled with fixed & initial delay method");
    }

    @Scheduled(fixedRate = 4000)
    public void sendMessageWithFixedRate(){
        System.out.println("Hey, I am scheduled with fixed rate method");
    }


    @Scheduled(cron = "*/3 * * * * *")
    public void sendMessagesCron(){
        System.out.println(LocalTime.now() + " : Hey, I am scheduled from cron method");
    }
}
