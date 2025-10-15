package com.app.mybatis.mapper;

import com.app.mybatis.domain.MemberVO;
import com.app.mybatis.domain.PostDTO;
import com.app.mybatis.domain.PostVO;
import com.app.mybatis.enums.PostStatus;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostTests {

    @Autowired
    private PostMapper postMapper;
    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void insertTest(){
//        PostVO postVO = new PostVO();
//        postVO.setPostTitle("오늘 뭐 먹지?");
//        postVO.setPostContent("오늘 메뉴 추천 좀!");
//        postVO.setPostStatus("PUBLIC".equals("PUBLIC") ? PostStatus.PUBLIC : PostStatus.PRIVATE);
//        postVO.setMemberId(1L);



        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("update123@gmail.com");
        memberVO.setMemberPassword("1234");
        memberMapper.selectOne(memberVO)
                    .map(MemberVO::getId)
                    .ifPresent(memberId -> {
                        PostVO postVO = new PostVO();
                        postVO.setPostTitle("오늘 늦잠 잠");
                        postVO.setPostContent("찔린 사람 범인!");
                        postVO.setPostStatus("PRIVATE".equals("PUBLIC") ? PostStatus.PUBLIC : PostStatus.PRIVATE);
                        postVO.setMemberId(memberId);
                        postMapper.insert(postVO);
                    });

    }

    @Test
    public void selectAllTest(){
        log.info("게시물 전체 조회: {}", postMapper.selectAll());
    }

    @Test
    public void selectTest(){
        postMapper.select(2L).map(PostDTO::toString).ifPresent(log::info);
    }

    @Test
    public void updateTest(){
        PostVO postVO = new PostVO();
        postVO.setId(1L);
        postVO.setPostTitle("테스트 합니다");
        postVO.setPostContent("안녕하세요");
        postVO.setPostStatus("PUBLIC".equals("PUBLIC") ? PostStatus.PUBLIC : PostStatus.PRIVATE);
        postMapper.update(postVO);
    }

    @Test
    public void deleteTest(){
        postMapper.delete(2L);
    }

}
