package com.dake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
public class SpringStudyApplication {
    public static void main(String[] args) {
        System.out.println("---------SpringBoot startup---------");
        try {
            SpringApplication.run(SpringStudyApplication.class, args);
        } catch (Exception e) {
            System.out.println("---------项目启动报错了---------");
        }
    }
}
