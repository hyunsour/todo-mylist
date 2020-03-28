package com.kakaoix.todolist.service;

import com.kakaoix.todolist.domain.posts.Posts;
import com.kakaoix.todolist.domain.posts.PostsRepository;
import com.kakaoix.todolist.web.dto.PostsResponseDto;
import com.kakaoix.todolist.web.dto.PostsSaveRequestDto;
import com.kakaoix.todolist.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(()->new
                        IllegalArgumentException("해당 게시글이 없음 id=" + id));
        posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }

    public PostsResponseDto findById(Long id){
        Posts entity = postsRepository.findById(id)
                .orElseThrow(()-> new
                        IllegalArgumentException("해당 게시글이 없음 id=" + id));
        return new PostsResponseDto(entity);
    }
}
