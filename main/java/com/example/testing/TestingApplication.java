package com.example.testing;

import com.example.testing.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TestingApplication.class, args);
		TestService bean = context.getBean(TestService.class);
		System.out.printf("Beans - " + bean.getMapSize());
	}

}
