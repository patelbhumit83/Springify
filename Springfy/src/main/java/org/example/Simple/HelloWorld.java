package org.example.Simple;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")  // For getting new object everytime...
public class HelloWorld {
    public HelloWorld()
    {
        System.out.println("Inside Helloworld Constructor");
    }

    public void hello()
    {
        System.out.println("Inside Helloworld Class");
    }

    @PostConstruct
    public void afterConstructor()
    {
        System.out.println("After Constructor");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("Before Destroy");
    }

}
