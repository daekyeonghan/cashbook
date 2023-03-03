package com.cash.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cash.dto.Category;
import com.cash.frame.MyMapper;

@Repository
@Mapper
public interface CategoryMapper extends MyMapper<String, Category>{

}
