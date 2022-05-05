package com.dake;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
public class SpringStudyApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringStudyApplication.class);

    public static void main(String[] args) {
        LOGGER.info("---------SpringBoot startup begin---------");

        try {
            SpringApplication.run(SpringStudyApplication.class, args);
            LOGGER.info("---------SpringBoot startup end---------");
        } catch (Exception e) {
            throw new RuntimeException("---------项目启动报错了：", e);
        }
    }
}
