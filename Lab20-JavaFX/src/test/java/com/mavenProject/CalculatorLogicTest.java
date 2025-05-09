package com.mavenProject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorLogicTest {

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, CalculatorLogic.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-7, CalculatorLogic.add(-3, -4));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(10, CalculatorLogic.add(10, 0));
    }

    @Test
    public void testAddMixedSigns() {
        assertEquals(0, CalculatorLogic.add(-5, 5));
    }
}
