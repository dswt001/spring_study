package com.dake.main;

import com.dake.entity.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class GetBeanFromXml {

    public static void main(String[] args) {

        Car car = getBeanByClassPath("car", Car.class);
        System.out.println(car);

    }

    public static <T> T getBeanByClassPath(String beanId, Class<T> tClass) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext ac = new ClassPathXmlApplicationContext("/src/main/resources/applicationContext.xml");
        return ac.getBean(beanId, tClass);
    }

    public static <T> T getBeanBySystemFile(String beanId, Class<T> tClass) {
        ApplicationContext ac = new FileSystemXmlApplicationContext(
                "E:\\workspace\\ide\\spring_study\\src\\applicationContext.xml");
        return ac.getBean(beanId, tClass);
    }

    public static <T> T getBeanByBeanFactory(String beanId, Class<T> tClass) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
        return beanFactory.getBean(beanId, tClass);
    }



}
