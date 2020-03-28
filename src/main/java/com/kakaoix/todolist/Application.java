package com.kakaoix.todolist;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Application {
    //start
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
