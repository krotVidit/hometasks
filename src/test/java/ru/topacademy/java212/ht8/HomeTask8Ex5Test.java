package ru.topacademy.java212.ht8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.java212.HomeTask8;

public class HomeTask8Ex5Test {

    @Test
    public void test_that_array_is_symmetric(){
        int [] arr = {1,2,3,2,1};
        boolean result = new HomeTask8().isSymmetric(arr);
        Assertions.assertTrue(result);
    }

    @Test
    public void test_that_array_is_not_symmetric(){
        int [] arr = {1,2,3,8,2,1};
        boolean result = new HomeTask8().isSymmetric(arr);
        Assertions.assertFalse(result);
    }

    @Test
    public void test_that_array_is_symmetric_from_example(){
        int [] arr = {5, 4, 3, 4, 5 };
        boolean result = new HomeTask8().isSymmetric(arr);
        Assertions.assertTrue(result);
    }


}
