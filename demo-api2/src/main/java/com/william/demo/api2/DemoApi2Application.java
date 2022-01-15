package com.william.demo.api2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.william.base.domain2, com.william.base.web2, com.william.base.utils2"})
public class DemoApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoApi2Application.class, args);
	}

}
