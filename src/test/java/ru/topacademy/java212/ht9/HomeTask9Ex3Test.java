package ru.topacademy.java212.ht9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.java212.HomeTask9;

public class HomeTask9Ex3Test {
    @Test
    public void max_number() {
        int a = 0;
        int b = 100;
        int n = 10;
        int[][] arr = HomeTask9.Ex2(a, b, n);
        int min = HomeTask9.MinNumber(arr);
        for (int[] line : arr) {
            for (int el : line) {
                if (el < min) {
                    Assertions.fail();
                }
            }
        }
    }
}
