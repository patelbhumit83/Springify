package org.example.Complex.Email;

import org.springframework.stereotype.Component;

@Component
public class GmailEmailService implements  EmailService{

    public GmailEmailService(){
        System.out.println("GmailEmailService Constructor is called");
    }

    @Override
    public void sendEmail(String to, String msg) {
        System.out.println("-------------------- Gmail Email Serice --------------------");
        System.out.println("Email sending to " + to);
        System.out.println("Message is :- " + msg);
        System.out.println("----------------------------------------------------------");
    }
}
