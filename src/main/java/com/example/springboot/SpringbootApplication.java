package com.example.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);

		// By code
		// By application.properties setting

//		SpringApplication springApplication = new SpringApplication(SpringbootApplication.class);
//		springApplication.setBannerMode(Banner.Mode.OFF);
//		springApplication.run(args);

	}

}
