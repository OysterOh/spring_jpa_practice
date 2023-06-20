package com.spring.jpa.chap05_practice.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
public class PostCreateDTO {
    @NotBlank
    @Size(min = 2, max = 5)
    private String writer;

//    @NotNull -> null 을 허용하지 않음 "", " "은 허용
//    @NotEmpty -> null, ""을 허용하지 않음 " "은 허용
    @NotBlank   // null, "", " " 다 안됨
    @Size(min = 1, max = 16)
    private String title;


    private String content;

    private List<String> hashTags;
}