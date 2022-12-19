package ru.topacademy.java212.ht8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.java212.HomeTask8;

public class HomeTask8Ex1Test {

    @Test
    public void test_that_array_example(){
        int [] arr = new int[17];
        arr[0] = 1;
        arr[1] = 1;
        boolean result = new HomeTask8().exampl1(arr);
        Assertions.assertTrue(result);
    }

}
