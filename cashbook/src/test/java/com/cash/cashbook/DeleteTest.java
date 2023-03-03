package com.cash.cashbook;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cash.service.CashbookService;

@SpringBootTest
class DeleteTest {
	
	@Autowired
	CashbookService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(101);
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
