package org.example.Simple;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String args[])
    {

        System.out.println("Spring Application");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After Context Init");
        HelloWorld hello1 = context.getBean(HelloWorld.class);
        HelloWorld hello2 = context.getBean(HelloWorld.class);
        hello1.hello();

        System.out.println(hello1 == hello2);

        context.close();

    }


}
