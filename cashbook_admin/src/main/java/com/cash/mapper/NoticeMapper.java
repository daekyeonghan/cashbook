package com.cash.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cash.dto.Notice;
import com.cash.frame.MyMapper;

@Repository
@Mapper
public interface NoticeMapper extends MyMapper<Integer, Notice>{

}
