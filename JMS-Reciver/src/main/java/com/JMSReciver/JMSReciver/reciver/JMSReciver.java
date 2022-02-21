package com.JMSReciver.JMSReciver.reciver;

import com.JMSReciver.JMSReciver.entity.Product;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.amqp.utils.SerializationUtils;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

@Component
public class JMSReciver implements ChannelAwareMessageListener {
	
	

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        System.out.println("Received <" + message + ">");
        message.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        Product product =  objectMapper.readValue(message.getBody(), Product.class);
        System.out.println("product = " + product);
    }
}
