package ru.topacademy.java212.ht14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.topacademy.java212.HomeTask14;

import java.util.Arrays;

public class HomeTask14Ex1Test {

    @Test
    public void test_array_utils_ex1(){
        int a = 5;
        int b = 10;
        int [][] soArr = HomeTask14.arrayMatrix(a,b,5);
        for(int[] line: soArr){
            for(int el: line){
                if(el<a || el>b){
                    Assertions.fail();
                }
            }
        }
    }
}
