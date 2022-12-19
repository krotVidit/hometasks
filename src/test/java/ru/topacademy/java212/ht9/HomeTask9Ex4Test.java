package ru.topacademy.java212.ht9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.java212.HomeTask9;

public class HomeTask9Ex4Test {


    @Test

    public void array_test_Ex4() {
        int rows = 10;
        int cols = 10;
        int[][] arr = HomeTask9.Ex4(rows, cols);
        Assertions.assertEquals(3, arr[0][2]);
        Assertions.assertEquals(4, arr[0][3]);
    }
}
