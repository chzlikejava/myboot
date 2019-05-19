package com.hai.myboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MybootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MybootApplication.class, args);
	}

}
