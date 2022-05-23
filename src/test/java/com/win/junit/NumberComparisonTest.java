package com.win.junit;

import com.win.junit.NumberComparison;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberComparisonTest {

    @DisplayName("Test compareNumbers() method")
    @Test
    void testCompare() {
        assertEquals("The numbers are the same.", NumberComparison.compareNumbers(10, 10));
        System.out.println("The tested numbers are the same.");
        assertEquals("The first number is less than the second number.", NumberComparison.compareNumbers(10, 11));
        System.out.println("The tested first number < second number.");
        assertEquals("The first number is greater than the second number.", NumberComparison.compareNumbers(11, 10));
        System.out.println("The tested first number > second number.");
    }

}