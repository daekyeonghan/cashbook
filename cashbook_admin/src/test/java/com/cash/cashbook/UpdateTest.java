package com.cash.cashbook;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cash.dto.Cashbook;
import com.cash.service.CashbookService;

@SpringBootTest
class UpdateTest {
	
	@Autowired
	CashbookService service;
	
	@Test
	void contextLoads() {
		try {
			Cashbook Cashbook = new Cashbook(101, "수입", 100000, "용돈", "2023-03-02", "급여");
			service.modify(Cashbook);
			System.out.println(Cashbook);
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
