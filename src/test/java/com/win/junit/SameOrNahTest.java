package com.win.junit;

import com.win.junit.SameOrNah;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SameOrNahTest {
    @DisplayName("Test checkIfWordsAreTheSasme() method")
    @Test
    void testWord() {
        String x = "yes";
        String y = "no";
        String z = "yes";

        assertEquals("The words are different.", SameOrNah.checkIfWordsAreTheSasme(x, y));
        assertEquals("The words are the same.", SameOrNah.checkIfWordsAreTheSasme(x, z));
    }
}
