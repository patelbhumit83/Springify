package org.example.Complex.Email;

import org.springframework.stereotype.Component;

@Component
public class AWSEmailService implements  EmailService{

    public AWSEmailService(){
        System.out.println("AWSEmailService Constructor is called");
    }

    @Override
    public void sendEmail(String to, String msg) {
        System.out.println("-------------------- AWS Email Serice --------------------");
        System.out.println("Email sending to " + to);
        System.out.println("Message is :- " + msg);
        System.out.println("----------------------------------------------------------");
    }
}
