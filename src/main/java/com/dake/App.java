package com.dake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("---------SpringBoot startup---------");
        SpringApplication.run(App.class, args);
    }
}
