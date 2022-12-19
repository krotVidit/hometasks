package ru.topacademy.java212.ht9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.java212.HomeTask9;

public class HomeTask9Ex2Test {
    @Test
    public void max_number() {
        int startRandom = 0;
        int endRandom = 100;
        int sizeArray = 10;
        int[][] arr = HomeTask9.Ex2(startRandom, endRandom, sizeArray);
        int max = HomeTask9.MaxNumber(arr);
        for (int[] line : arr) {
            for (int el : line) {
                if (el > max) {
                    Assertions.fail();
                }
            }
        }
    }
}