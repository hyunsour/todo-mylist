package com.kakaoix.todolist.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


}
