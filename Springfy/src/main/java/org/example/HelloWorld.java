package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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

}
