package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    // Disabling code coverage for the class logger and the main method
    ///CLOVER:OFF
    public static void main(String[] args) { SpringApplication.run(Application.class, args); }
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    ///CLOVER:ON

    protected String getHelloWorld() { logger.info("Returning: Hello world!"); return "Hello world!"; }

}
