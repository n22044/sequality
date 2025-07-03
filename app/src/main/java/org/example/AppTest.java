package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAppMainRuns() {
        // Appクラスのmainメソッドが例外を投げずに実行できるかの簡易テスト
        try {
            App.main(new String[] {});
        } catch (Exception e) {
            fail("App.main threw an exception: " + e.getMessage());
        }
    }
}
