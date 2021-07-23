package com.example.consumerChannel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding(ConsumerChannel.class)
@Slf4j
public class ConsumerChannelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerChannelApplication.class, args);
	}

	public void test(){
		System.out.println("a");
	}

	@StreamListener(ConsumerChannel.DIRECT)
	public void handleDirect(MyMessage message) {
		log.info("##### direct message : {}", message.getMessage());
	}

	@StreamListener(ConsumerChannel.BROADCAST)
	public void handleBroadcast(MyMessage message) {
		log.info("##### broadcast message : {}", message.getMessage());
	}

}
