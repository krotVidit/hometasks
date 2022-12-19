package ru.topacademy.java212.ht10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.java212.HomeTask10;

public class HomeTask10Ex3Test {


    @Test

    public void test_ex3(){
        String str = "hello java world";
        int evenWords = new HomeTask10().ex3(str);
        Assertions.assertEquals(1, evenWords);
        System.out.println(str);
    }

}
