package ru.topacademy.java212.ht9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.java212.HomeTask9;

public class HomeTask9Ex1Test {
    @Test
    public void arr_Ex1() {
        int n = 10;
        int m = 10;
        int[][] arr =  new HomeTask9().Ex1(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != (i + 1) * (j + 1)) {
                    Assertions.fail();

                }
            }
        }

    }
}
