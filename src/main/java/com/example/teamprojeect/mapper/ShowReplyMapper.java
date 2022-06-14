package com.example.teamprojeect.mapper;

import com.example.teamprojeect.domain.vo.Criteria;
import com.example.teamprojeect.domain.vo.ShowReplyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShowReplyMapper {

    // 공연 댓글 등록
    public void insert(ShowReplyVO artistReplyVO);

    // 공연 댓글 수정
    public int update(ShowReplyVO artistReplyVO);

    // 공연 댓글 삭제
    public int delete(Long replyNumber);

    // 공연 댓글 개수
    public int getTotal(Long artistNumber);

    // 공연 댓글 목록
    public List<ShowReplyVO> getList(@Param("criteria") Criteria criteria, @Param("artistNumber")Long artistNumber);

}
