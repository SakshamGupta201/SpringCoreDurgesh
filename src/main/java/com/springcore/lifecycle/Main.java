package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/lifecycle/config.xml");
        Food food = (Food) context.getBean("food");
        System.out.println(food);
        context.registerShutdownHook();
    }
}
