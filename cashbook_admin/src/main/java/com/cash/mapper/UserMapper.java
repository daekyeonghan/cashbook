package com.cash.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cash.dto.User;
import com.cash.frame.MyMapper;

@Repository
@Mapper
public interface UserMapper extends MyMapper<String, User>{

}
