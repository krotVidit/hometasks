package ru.topacademy.java212.learn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class ExceptionsClassTest {

    ExceptionsClass underTest = new ExceptionsClass();

    @Test
    public void run_to_get_outer_try_exception() {
        int result = underTest.runToSeeExceptions(5);
        Assertions.assertEquals(2, result);

    }

    @Test
    public void run_to_get_inner_try_exception() {
        int result = underTest.runToSeeExceptions(4);
        Assertions.assertEquals(4, result);

    }

    @Test
    public void run_to_get_no_exceptions() {
        int result = underTest.runToSeeExceptions(7);
        Assertions.assertEquals(3, result);

    }


    @Test
    public void test_that_outer_method_throws_exception() {
        Assertions.assertThrows(MalformedURLException.class,
                () -> underTest.outerMethod(3)
        );
    }

    @Test
    public void test_that_outer_method_no_exception() {
        try {
            underTest.outerMethod(4);
        } catch (MalformedURLException e) {
            Assertions.fail();
        }
    }

}
