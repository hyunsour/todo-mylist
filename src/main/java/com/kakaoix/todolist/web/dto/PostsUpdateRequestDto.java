package com.kakaoix.todolist.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;
    private String isFin;

    @Builder
    public PostsUpdateRequestDto(String title, String content, String isFin){
        this.title = title;
        this.content = content;
        this.isFin = isFin;
    }
}
