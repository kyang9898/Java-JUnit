package com.win.junit;

import com.win.junit.BoilingWater;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoilingWaterTest {

    @DisplayName("Test isBoiling() method")
    @Test
    void testIsBoiling() {
        assertEquals("Water is boiling!", BoilingWater.isBoiling(213));
        assertEquals("The water is starting to boil", BoilingWater.isBoiling(212));
        assertEquals("Water is not boiling yet", BoilingWater.isBoiling(211));
    }

}