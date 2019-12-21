package com.jcircle.easyrules.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class RulesAppApplication {

	public static void main(String[] args) {
		System.out.println("----In main-----");
		SpringApplication.run(RulesAppApplication.class, args);
	}

}
