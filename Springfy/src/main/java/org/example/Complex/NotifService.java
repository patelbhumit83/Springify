package org.example.Complex;


import org.example.Complex.Email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotifService {

    //property based DI
    @Autowired
    @Qualifier("AWSEmailService")
    private EmailService emailService;

    //Constructor based DI
//    public NotifService(EmailService emailService)
//    {
//        this.emailService = emailService;
//    }

    public void sendNotification(String to, String msg)
    {
//        System.out.println("HI");
        this.emailService.sendEmail(to,msg);
    }
}
