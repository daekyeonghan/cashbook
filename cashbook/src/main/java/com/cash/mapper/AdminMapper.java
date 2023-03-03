package com.cash.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cash.dto.Admin;
import com.cash.frame.MyMapper;

@Repository
@Mapper
public interface AdminMapper extends MyMapper<String, Admin>{

}
