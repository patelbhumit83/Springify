package org.example.Complex;

import org.example.Simple.Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String args[])
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        NotifService notifService = context.getBean(NotifService.class);
        notifService.sendNotification("Patelbhuumit", "ajkbcsdbcjkbkjdc");
        context.close();
    }
}
