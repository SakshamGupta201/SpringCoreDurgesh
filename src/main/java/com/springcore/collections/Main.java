package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/collections/config.xml");
        Employees employees = (Employees) (context.getBean("Saksham"));
        System.out.println(employees);
    }
}
