package com.cash.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cash.dto.Comment;
import com.cash.frame.MyMapper;

@Repository
@Mapper
public interface CommentMapper extends MyMapper<Integer, Comment>{

}
