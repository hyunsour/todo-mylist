package com.kakaoix.todolist.web.dto;

import com.kakaoix.todolist.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String isFin;

    @Builder
    public PostsSaveRequestDto(String title, String content, String isFin){
        this.title = title;
        this.content = content;
        this.isFin = isFin;
    }

    public Posts toEntity(){
        return Posts.builder().title(title)
                              .content(content)
                              .isFin(isFin)
                              .build();
    }
}
