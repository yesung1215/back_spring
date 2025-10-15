package com.app.mybatis.domain;

import com.app.mybatis.enums.PostStatus;
import lombok.*;

@Getter @Setter @ToString @EqualsAndHashCode
@AllArgsConstructor @NoArgsConstructor

public class PostDTO {
    private Long id;
    private String postTitle;
    private String postContent;
    private PostStatus postStatus;
    private Long postReadCount;
    private Long memberId;
    private String memberEmail;
    private String memberName;
}

