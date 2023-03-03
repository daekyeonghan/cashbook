package com.cash.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cash.dto.Cashbook;
import com.cash.frame.MyMapper;

@Repository
@Mapper
public interface CashbookMapper extends MyMapper<Integer, Cashbook>{

}
