package com.mc4.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mc4.commons.base", "com.mc4.challenge"})
public class CodeChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeChallengeApplication.class, args);
    }

}
