package com.example.springboot;

import com.example.springboot.UserRelation.service.mail.MailProperties;
import com.example.springboot.UserRelation.service.mail.MailService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(MailProperties.class)
public class SpringbootApplication {

	private final static Logger logger = LogManager.getLogger(SpringbootApplication.class);

	public static void main(String[] args) {

		logger.info("Spring Boot Log is able to display");

		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		MailService mailService = context.getBean(MailService.class);
		mailService.print();
		// By code
		// By application.properties setting

//		SpringApplication springApplication = new SpringApplication(SpringbootApplication.class);
//		springApplication.setBannerMode(Banner.Mode.OFF);
//		springApplication.run(args);

	}

}
