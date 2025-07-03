package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppMainRuns() {
        try {
            App classUnderTest = new App();
            assertNotNull("app should have a greeting", classUnderTest.getGreeting());
        } catch (Exception e) {
            fail("App.main threw an exception: " + e.getMessage());
        }
    }
}
