package com.dake;


import com.dake.entity.bo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = ac.getBean(Person.class);
        System.out.println(person);

    }
}
