package com.cash.cashbook;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cash.dto.Cashbook;
import com.cash.service.CashbookService;

@SpringBootTest
class InsertTest {
	
	@Autowired
	CashbookService service;
	
	@Test
	void contextLoads() {
		Cashbook Cashbook = new Cashbook(0, "지출", 10000, "택시비", "2023-03-03", null, "id01", "교통비");
		try {
			service.register(Cashbook);
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
