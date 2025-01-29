package com.example.springboot.UserRelation.service.mail;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@ConfigurationProperties(prefix = "myapp.mail")
@Validated
public class MailProperties{
    @Email
    private String to;

    @NotNull
    private String host;

    private String port;
    private String[] cc;
    private List<String> bcc;

    @Valid
    private Credential credential = new Credential();


    public @Email String getTo() {
        return to;
    }

    public void setTo(@Email String to) {
        this.to = to;
    }

    public @NotNull String getHost() {
        return host;
    }

    public void setHost(@NotNull String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String[] getCc() {
        return cc;
    }

    public void setCc(String[] cc) {
        this.cc = cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }
}
