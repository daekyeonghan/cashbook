package com.cash.cashbook;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cash.dto.Cashbook;
import com.cash.service.CashbookService;

@SpringBootTest
class SelectTest {
	
	@Autowired
	CashbookService service;
	
	@Test
	void contextLoads() {
		Cashbook Cashbook = null;
		try {
			Cashbook = service.get(100);
			System.out.println(Cashbook);
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
