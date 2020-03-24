package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    @Test public void testGetHelloWorld() {
        Application app = new Application();
        assertNotNull("Application.getHelloWorld() should return a valid String", app.getHelloWorld());
    }
}
