package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    private static final Logger logger = LoggerFactory.getLogger(RootController.class);

    // Disabling code coverage for RequestMapping since Clover doesn't recognize MockMVC tests
    ///CLOVER:OFF
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String rootGetRequest(@RequestParam(value = "name", defaultValue = "Person") String name) {
        return getHelloWorld(name);
    }
    ///CLOVER:ON

    protected String getHelloWorld(String name){
        String template = "Hello, %s!";
        String response = "{ \"content\": \"" + String.format(template, name) + "\" }";
        logger.info("Replying with: " + response);
        return response;
    }
}
