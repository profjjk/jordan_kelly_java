package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldAddTwoIntegers() {
        assertEquals(2, calc.addInts(1, 1));
    }

    @Test
    public void shouldSubtractTwoIntegers() {
        assertEquals(-29, calc.subtractInts(23, 52));
    }

    @Test
    public void shouldMultiplyTwoIntegers() {
        assertEquals(68, calc.multiplyInts(34, 2));
    }

    @Test
    public void shouldDivideTwoIntegers() {
        assertEquals(4, calc.divideInts(12, 3));
    }

    @Test
    public void shouldDivideTwoIntegersAndReturnInteger() {
        assertEquals(1, calc.divideInts(12, 7));
    }

    @Test
    public void shouldAddTwoDoubles() {
        assertEquals(5.69, calc.addDoubles(3.4, 2.3), 0.01);
    }

    @Test
    public void shouldSubtractTwoDoubles() {
        assertEquals(5.0, calc.subtractDoubles(5.5, 0.5), 0.01);
    }

    @Test
    public void shouldMultiplyTwoDoubles() {
        assertEquals(29.48, calc.multiplyDoubles(6.7, 4.4), 0.01);
    }

    @Test
    public void shouldDivideTwoDoubles() {
        assertEquals(4.90, calc.divideDoubles(10.8, 2.2), 0.01);
    }
}