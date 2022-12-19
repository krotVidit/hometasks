package ru.topacademy.java212.ht10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.java212.HomeTask10;

public class HomeTask10Ex2Test {


    @Test

    public void test_ex2() {
        String str = "hello world";
        double average = new HomeTask10().ex2(str);
        Assertions.assertEquals(5.0, average);

    }
}
