package com.win.junit;

import com.win.junit.Greetings;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingsTest {
    @DisplayName("Test inputName() method and returns hello '' !")
    @Test
    public void inputNameTest() {
        String userInput = "Name";
        ByteArrayInputStream name = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(name);

        ByteArrayOutputStream names = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(names);
        System.setOut(printStream);

        Greetings.main(null); // call the main method

        String[] lines = names.toString().split(System.lineSeparator());
        String actualName = lines[lines.length - 1];

        assertEquals("hello Name!", actualName);
    }

}