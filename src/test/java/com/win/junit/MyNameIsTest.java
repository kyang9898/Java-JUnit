package com.win.junit;

import com.win.junit.MyNameIs;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyNameIsTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @DisplayName("Test firstLine()method")
    @Test
    void testFirstLine() {
        assertEquals("My name is", MyNameIs.firstLine("My name is"));
        System.out.println("First line test is a success.");
    }

    @DisplayName("Test secondLine() method")
    @Test
    void testSecondLine() {
        assertEquals("run", MyNameIs.secondLine("run"));
        System.out.println("Second line test is a success.");
    }

    @DisplayName("Test thirdLine() method")
    @Test
    void testThirdLine() {
        assertEquals("sssstrun", MyNameIs.secondLine("sssstrun"));
        System.out.println("Third Line test is a success.");
    }

}
