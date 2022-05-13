package com.nhuallpa.problems.tricoloring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TricolorerTest {

    @Test
    void testShortPositiveNumbers() {
        var colors = Tricolorer.calculate(new int[]{2,4,4,2});
        assertEquals("RGBR", colors);
    }

    @Test
    void testShortPositiveNumbers2() {
        var colors = Tricolorer.calculate(new int[]{3,7,2,5,4});
        assertEquals("RGBBR", colors);
    }



}