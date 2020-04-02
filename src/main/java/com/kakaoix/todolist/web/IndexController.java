package com.kakaoix.todolist.web;

import com.kakaoix.todolist.service.PostsService;
import com.kakaoix.todolist.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    @GetMapping("/modify/{id}")
    public String modify(Model model, @PathVariable Long id){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "modify";
    }
}
