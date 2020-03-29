package com.kakaoix.todolist.web;

import com.kakaoix.todolist.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }
}
