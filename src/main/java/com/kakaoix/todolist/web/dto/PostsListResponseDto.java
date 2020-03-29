package com.kakaoix.todolist.web.dto;

import com.kakaoix.todolist.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime crDate;
    private LocalDateTime mdDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.crDate = entity.getCrDate();
        this.mdDate = entity.getMdDate();
    }
}
