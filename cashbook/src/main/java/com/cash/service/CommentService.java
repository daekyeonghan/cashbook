package com.cash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cash.dto.Comment;
import com.cash.frame.MyService;
import com.cash.mapper.CommentMapper;

@Service
public class CommentService implements MyService<Integer, Comment> {
	
	@Autowired
	CommentMapper mapper;

	@Override
	public void register(Comment v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Comment v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Comment get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<Comment> get() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}

}
