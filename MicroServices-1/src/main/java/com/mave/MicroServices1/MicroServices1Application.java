package com.mave.MicroServices1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class MicroServices1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServices1Application.class, args);
	}

}
