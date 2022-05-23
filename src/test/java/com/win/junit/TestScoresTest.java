package com.win.junit;

import com.win.junit.TestScores;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestScoresTest {
    @DisplayName("Test testGrade() method")
    @Test
    void testProcessScore() {
        int x = 33;
        int y = 95;
        int z = 101;

        assertEquals("You made an F... You failed!", TestScores.testGrade(x));
        assertEquals("Great Job! You passed and made an A!", TestScores.testGrade(y));
        assertEquals("How did you get over 100?!", TestScores.testGrade(z));
    }
}
