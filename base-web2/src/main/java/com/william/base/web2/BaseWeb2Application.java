package com.william.base.web2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.william.*"})
public class BaseWeb2Application {

	public static void main(String[] args) {
		SpringApplication.run(BaseWeb2Application.class, args);
	}

}
