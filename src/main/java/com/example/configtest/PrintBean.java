package com.example.configtest;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class PrintBean {

    private final Config config;

    public PrintBean(Config config) {
        this.config = config;
    }

    @Scheduled(fixedDelay = 1000)
    public void print() {
        System.out.println(config.getValue());
    }
}
