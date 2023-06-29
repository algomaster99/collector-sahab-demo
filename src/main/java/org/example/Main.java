package org.example;

public class Main {

    static String demo(int x) {
        x = x + 1;
        if (x % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
