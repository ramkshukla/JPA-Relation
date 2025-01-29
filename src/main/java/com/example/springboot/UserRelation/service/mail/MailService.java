package com.example.springboot.UserRelation.service.mail;

import org.springframework.stereotype.Component;

@Component
public class MailService {

    private final MailProperties mailProperties;

    public MailService(MailProperties mailProperties) {
        this.mailProperties = mailProperties;
    }

    public void print(){
        System.out.println("Mail To  = " + mailProperties.getTo());
        System.out.println("Host = " + mailProperties.getHost());
        System.out.println("Port = " + mailProperties.getPort());
        System.out.println();

        System.out.println("Mail CC =" + String.join(", ", mailProperties.getCc()));
        System.out.println("MAIL BCC = " + mailProperties.getBcc());
        System.out.println();

        // Printed nested bean's properties
        System.out.println("User Name: " + mailProperties);



    }
}
