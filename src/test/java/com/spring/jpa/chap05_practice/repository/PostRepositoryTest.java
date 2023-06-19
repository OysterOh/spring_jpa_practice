package com.spring.jpa.chap05_practice.repository;

import com.spring.jpa.chap05_practice.entity.Post;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
@SpringBootTest
@Transactional
@Rollback(false)
class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;
    @Test
    @DisplayName("bulk insert")
    void bulkInsert() {
        for(int i=1; i<=300; i++) {
            postRepository.save(
                    Post.builder()
                            .title("제목" + i)
                            .content("내용내용" + i)
                            .writer("흐아" + i)
                            .build()
            );

        }
    }
}