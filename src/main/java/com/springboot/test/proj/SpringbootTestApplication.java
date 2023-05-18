package com.springboot.test.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("com.springboot.test.proj")
public class SpringbootTestApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootTestApplication.class, args);
	}

}
