package com.kakaoix.todolist.domain.posts;

import com.kakaoix.todolist.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String isFin;

    @Builder
    public Posts(String title, String content, String isFin){
        this.title = title;
        this.content = content;
        this.isFin = isFin;
    }

    public void update(String title, String content, String isFin){
        this.title = title;
        this.content = content;
        this.isFin = isFin;
    }

    public void delete(Long id){
        this.id = id;
    }

}
