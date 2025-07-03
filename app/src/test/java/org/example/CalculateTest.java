package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void testSum() {
        Calculate calc = new Calculate();
        assertEquals(5, calc.sum(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculate calc = new Calculate();
        assertEquals(1, calc.subtract(4, 3));
    }

    @Test
    public void testMultiply() {
        Calculate calc = new Calculate();
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    public void testDivide() {
        Calculate calc = new Calculate();
        assertEquals(2, calc.divide(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculate calc = new Calculate();
        calc.divide(10, 0);
    }

    @Test
    public void testAverage_TwoValues() {
        Calculate calc = new Calculate();
        assertEquals(2.5, calc.average(2, 3), 0.01);
    }

    @Test
    public void testAverage_ArrayValues() {
        Calculate calc = new Calculate();
        int[] values = { 1, 2, 3, 4, 5 };
        assertEquals(3.0, calc.average(values), 0.01);
    }
}
