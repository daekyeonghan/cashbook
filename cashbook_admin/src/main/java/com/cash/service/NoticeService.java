package com.cash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cash.dto.Notice;
import com.cash.frame.MyService;
import com.cash.mapper.NoticeMapper;

@Service
public class NoticeService implements MyService<Integer, Notice> {
	
	@Autowired
	NoticeMapper mapper;

	@Override
	public void register(Notice v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Notice v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Notice get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<Notice> get() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}

}
