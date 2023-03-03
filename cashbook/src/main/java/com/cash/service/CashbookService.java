package com.cash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cash.dto.Cashbook;
import com.cash.frame.MyService;
import com.cash.mapper.CashbookMapper;

@Service
public class CashbookService implements MyService<Integer, Cashbook> {
	
	@Autowired
	CashbookMapper mapper;

	@Override
	public void register(Cashbook v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Cashbook v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Cashbook get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<Cashbook> get() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}

}
