package com.example.group14orderservice;

import com.example.group14orderservice.service.SeatSevice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Group14OrderServiceApplicationTests {
	@Autowired
	private SeatSevice dubboSeatimpl;
	@Test
	void contextLoads() {

	}

}
