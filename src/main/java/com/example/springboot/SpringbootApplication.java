package com.example.springboot;

import com.example.springboot.mail.MailProperties;
import com.example.springboot.mail.MailService;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MailProperties.class)
public class SpringbootApplication {

	public static void main(String[] args) {
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
