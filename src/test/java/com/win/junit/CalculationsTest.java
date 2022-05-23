package com.win.junit;

import com.win.junit.Calculations;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationsTest {
    int x = 6;
    int y = 9;

    @DisplayName("Test addition method")
    @Test

    void testAddition() {
        assertEquals(15, Calculations.addition(x, y));
    }

    @DisplayName("Test subtraction method")
    @Test

    void testSubtraction() {
        assertEquals(-3, Calculations.subtraction(x, y));
    }

    @DisplayName("Test multiplication method")
    @Test

    void testMultiplication() {
        assertEquals(54, Calculations.multiplication(x, y));
    }

    @DisplayName("Test division method")
    @Test

    void testDivision() {
        assertEquals(0.6666666666666666, Calculations.division(x, y));
    }

    @DisplayName("Test modulos method")
    @Test

    void testModulos() {
        assertEquals(6, Calculations.modulos(x, y));
    }

}
