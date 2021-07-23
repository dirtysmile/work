package com.example.consumerChannel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerChannelApplicationTests {

	ConsumerChannelApplication consumerChannelApplication = new ConsumerChannelApplication();

	@Test
	void contextLoads() {
		System.out.println("a");
		consumerChannelApplication.handleBroadcast(new MyMessage("aa"));
	}

}
