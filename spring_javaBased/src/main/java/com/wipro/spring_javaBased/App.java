package com.wipro.spring_javaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.spring_javaBasedConfig.Myconfiguration;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Myconfiguration.class);
        Student student = (Student)context.getBean("getStudent");
        System.out.println(student);
    }
}
