package com.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaConsumer {

	@KafkaListener(topics="helloTopic", groupId="consumer-group")
	public void consume(String message) {
		System.out.println("Message Consumed: "+ message);
	}
}
