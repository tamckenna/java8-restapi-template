package com.example.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RootControllerTest {

    @Test public void verifyGetHelloWorldStringGeneration() throws Exception{
        String input = "Tester";
        String expected = "{ \"content\": \"" + "Hello, " + input + "!" + "\" }";
        String actual = "";
        RootController rootController = new RootController();
        actual = rootController.getHelloWorld(input);
        assertTrue("RootController.getHelloWorld(String name) should return expected String output", expected.equals(actual));
    }
}
