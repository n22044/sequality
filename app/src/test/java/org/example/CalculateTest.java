package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testAppReturnHelloWorld() {
        App classUnderTest = new App();
        // P56: GitHub Actions 起動テストのためにコメントを追加
        assertEquals("P56 Test: Hello World expected", "Hello World!", classUnderTest.getGreeting());
    }
}
