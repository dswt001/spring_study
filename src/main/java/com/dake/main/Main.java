package com.dake.main;

import com.dake.vo.Car;
import com.dake.vo.HelloWorld;
import com.dake.vo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // 开发人员自己创建对象
        // 1.创建HelloWorld的一个对象
//        HelloWorld helloWorld = new HelloWorld();
//        // 2.为name属性赋值
//        helloWorld.setName("dake");
//        // 3.调用 hello 方法
//        helloWorld.hello();

        /*
            Spring为我们创建对象

            1.创建 Spring 的 IOC 容器对象
            ApplicationContext即为 Spring 的IOC容器的接口；
            ClassPathXmlApplicationContext 获取配置文件，其中参数不需要加classpath:前缀
         */
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        // 2.从 IOC 容器中获取 Bean 实例
        HelloWorld helloWorld1 = (HelloWorld) ac.getBean("helloWorld");

        // 利用类型返回IOC容器中的bean，但要求IOC容器中必须只能有一个该类型的bean
//        HelloWorld helloWorld1 = ac.getBean(HelloWorld.class);
        // 3.调用 hello 方法
//        helloWorld1.hello();

        /*
            如果只创建容器，那么在创建容器时会调用构造器，然后对配置文件中配置的bean进行初始化，同时会调用setter方法对属性进行赋值。
            即构造器中会输出，而setter方法中也会输出。
            既然创建容器时已经创建了对象并进行了初始化，那么 2、3两步获取bean实例与调用bean方法就顺理成章了。
         */

        /*Car car = ac.getBean(Car.class);
        System.out.println(car);*/

        Car car = (Car) ac.getBean("car");
        System.out.println(car);

        Car car2 = (Car) ac.getBean("car2");
        System.out.println(car2);

        Car car3 = (Car) ac.getBean("car3");
        System.out.println(car3);

        Car car4 = (Car) ac.getBean("car4");
        System.out.println(car4);

        Car car5 = (Car) ac.getBean("car5");
        System.out.println(car5);

        Car car6 = (Car) ac.getBean("car6");
        System.out.println(car6);

        Car car7 = (Car) ac.getBean("car7");
        System.out.println(car7);

        Person person = (Person) ac.getBean("person");
        System.out.println(person);

        Person person1 = (Person) ac.getBean("person1");
        System.out.println(person1);

        Person person2 = (Person) ac.getBean("person2");
        System.out.println(person2);

        Person person3 = (Person) ac.getBean("person3");
        System.out.println(person3);

        Person person4 = (Person) ac.getBean("person4");
        System.out.println(person4);
    }
}
