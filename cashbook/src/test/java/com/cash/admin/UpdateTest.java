package com.cash.admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cash.dto.Admin;
import com.cash.service.AdminService;

@SpringBootTest
class UpdateTest {
	
	@Autowired
	AdminService service;
	
	@Test
	void contextLoads() {
		try {
			Admin Admin = new Admin("admin01","pwd02");
			service.modify(Admin);
			System.out.println(Admin);
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
