package com.example.helloworld;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void shouldCreateApp() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest);
    }
}