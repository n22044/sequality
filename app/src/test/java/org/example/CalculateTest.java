package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testAppReturnHelloWorld() {
        App classUnderTest = new App();
        assertEquals("Hello World!", classUnderTest.getGreeting());
    }
}
