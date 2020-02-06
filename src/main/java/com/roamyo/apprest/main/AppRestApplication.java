package com.roamyo.apprest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.roamyo.apprest"})
public class AppRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppRestApplication.class, args);
	}

}
