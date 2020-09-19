package com.dake.spring.beans.conllections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person5 = (Person) ac.getBean("person5");
        System.out.println(person5);
    }
}
