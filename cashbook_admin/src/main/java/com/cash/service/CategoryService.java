package com.cash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cash.dto.Category;
import com.cash.frame.MyService;
import com.cash.mapper.CategoryMapper;

@Service
public class CategoryService implements MyService<String, Category> {
	
	@Autowired
	CategoryMapper mapper;

	@Override
	public void register(Category v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Category v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Category get(String k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<Category> get() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}

}
