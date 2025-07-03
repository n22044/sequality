package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void testSum_TwoAndThree_ReturnsFive() {
        Calculate calc = new Calculate();
        assertEquals(5, calc.sum(2, 3));
    }

    @Test
    public void testSum_MinusOneAndThree_ReturnsTwo() {
        Calculate calc = new Calculate();
        assertEquals(2, calc.sum(-1, 3));
    }

    @Test
    public void testSum_ZeroAndZero_ReturnsZero() {
        Calculate calc = new Calculate();
        assertEquals(0, calc.sum(0, 0));
    }

    // 🔽 これが p59 に対応する新しいテストケースの追加（変更点）
    @Test
    public void testSum_TenAndTwenty_ReturnsThirty() {
        Calculate calc = new Calculate();
        assertEquals(30, calc.sum(10, 20));
    }
}
