package xyz.kail.demo.spring.integration.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath*:/hello/integration.xml");
    }

}
