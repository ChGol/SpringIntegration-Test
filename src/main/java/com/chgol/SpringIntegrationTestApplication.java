package com.chgol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

@SpringBootApplication
public class SpringIntegrationTestApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationTestApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		MessageChannel input = (MessageChannel) context.getBean("input");
		input.send(new GenericMessage<>("Spring Integration rocks"));
		System.out.println("#####Test#####");
	}
}
