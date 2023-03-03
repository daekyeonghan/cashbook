package com.cash.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cash.dto.Board;
import com.cash.frame.MyMapper;

@Repository
@Mapper
public interface BoardMapper extends MyMapper<Integer, Board>{

}
