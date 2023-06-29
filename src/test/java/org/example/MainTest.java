package org.example;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void is_1_oddOrEven() {
        String s = Main.demo(1);
        assert s.equals("odd");
    }
}
