package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get MyService bean
        MyService myService = context.getBean("myService", MyService.class);

        // Call method
        myService.sayHello();

        // Close context if using ClassPathXmlApplicationContext
        ((ClassPathXmlApplicationContext) context).close();
    }
}
