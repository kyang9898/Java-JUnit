package com.win.junit;

import com.win.junit.Box;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTest {
    Box testBox = new Box(6, 9);
    Box secondTestBox = new Box(testBox);
    Box thirdTestBox = new Box(3, 9);
    Box fourthTestBox = new Box(thirdTestBox);

    @DisplayName("Test isEqual method")
    @Test
    void testIsEqual() {
        assertEquals(true, testBox.isEqual(secondTestBox));
        assertEquals(false, testBox.isEqual(thirdTestBox));
        assertEquals(true, thirdTestBox.isEqual(fourthTestBox));
    }

    @DisplayName("Test method by calling the isEqual() method")
    @Test
    void testDuplicate() {
        Box fifthTestBox = fourthTestBox.duplicateBox();
        assertEquals(true, fifthTestBox.isEqual(fourthTestBox));
    }

    @DisplayName("Test isTwoObjectsEqual(Box b1, Box b2) method")
    @Test
    void testIsTwoBoxEqual() {
        assertEquals(true, Box.isEqual(testBox, secondTestBox));
        assertEquals(false, Box.isEqual(testBox, thirdTestBox));
    }

    @DisplayName("test display() method")
    @Test
    void testDisplay() {
        assertEquals("The width of the box is 6 and the height of the box is 9", testBox.display());
    }

}
