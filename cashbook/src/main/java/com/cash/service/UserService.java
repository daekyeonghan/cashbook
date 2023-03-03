package com.cash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cash.dto.User;
import com.cash.frame.MyService;
import com.cash.mapper.UserMapper;

@Service
public class UserService implements MyService<String, User> {
	
	@Autowired
	UserMapper mapper;

	@Override
	public void register(User v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(User v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public User get(String k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<User> get() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}

}
