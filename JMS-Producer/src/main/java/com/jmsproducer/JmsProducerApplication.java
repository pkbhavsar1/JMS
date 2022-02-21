package com.jmsproducer;

import com.jmsproducer.config.RabbitMQConfig;
import com.jmsproducer.entity.Product;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsProducerApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(JmsProducerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
		product.setProductId(101);
		product.setName("Samsung S21");
		product.setQuantity(100);

		System.out.println("Sending Message");
		rabbitTemplate.convertAndSend(RabbitMQConfig.topicExchangeName, "message_routing_key", product);
		System.out.println("Message Sent");
	}
}
