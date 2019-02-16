package com.hodongman.days;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaysApplication.class, args);
	}

}

