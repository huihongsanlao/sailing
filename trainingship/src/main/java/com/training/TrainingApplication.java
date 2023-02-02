package com.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.training"})
public class TrainingApplication{
    private static Logger logger = LoggerFactory.getLogger(TrainingApplication.class);
    public static void main(String[] args) {
        try {
            SpringApplication.run(TrainingApplication.class, args);
        } catch (Exception e) {
            logger.error("异常信息：", e);
        }
    }
}
