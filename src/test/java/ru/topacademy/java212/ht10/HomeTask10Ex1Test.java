package ru.topacademy.java212.ht10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.java212.HomeTask10;

public class HomeTask10Ex1Test {


    @Test

    public void test_ex1() {
        int stringLength = 1000;
        StringBuilder str = new HomeTask10().ex1(stringLength);
        Assertions.assertEquals(49, str.charAt(1));
        Assertions.assertEquals(49, str.charAt(1));
    }

}
