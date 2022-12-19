package ru.topacademy.java212.ht11;

import org.junit.jupiter.api.Test;
import ru.topacademy.java212.ArrayUtils;

import java.util.Arrays;

public class HomeTask11Ex1 {
    @Test
    public void test_ht11_ex1(){
        int[][] soArr = ArrayUtils.matrixArrays(1, 3, 5);
        System.out.print(Arrays.deepToString(soArr).replace("],", "]\n"));
    }
}
