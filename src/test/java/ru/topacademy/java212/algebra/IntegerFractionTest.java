package ru.topacademy.java212.algebra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class IntegerFractionTest {
    @Test
    public void test_multiplication_is_ok() {
        IntegerFraction fraction = new IntegerFraction(4,4,5);
        IntegerFraction fraction1 = new IntegerFraction(4,2,3);
        IntegerFraction fraction2 = fraction.multiply(fraction1);
        Assertions.assertEquals("22 2/5",fraction2.toString());
    }

    @Test
    public void test_that_multiplication_with_no_fractions_is_ok() {
        IntegerFraction fraction = new IntegerFraction(1,1,2);
        IntegerFraction fraction1 = new IntegerFraction(1,1,3);
        IntegerFraction fraction2 = fraction.multiply(fraction1);
        Assertions.assertEquals("2 0/1",fraction2.toString());
    }
}
