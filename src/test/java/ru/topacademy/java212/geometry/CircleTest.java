package ru.topacademy.java212.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void verify_the_length_circle() {
        Circle s = new Circle(5.5);
        Assertions.assertEquals(34.55751918948772, s.circleLength());
    }

    @Test
    public void verify_the_area_circle() {
        Circle s = new Circle(5.5);
        Assertions.assertEquals(95.03317777109125, s.circleArea());


    }

    @Test
    public void test_that_compare_with_object_is_minus_one(){
        Circle s = new Circle(5.5);
        Object o = new Object();
        int compareResult = s.compareTo(o);
        Assertions.assertEquals(-1, compareResult);


    }

    @Test
    public void test_that_compare_with_greater_radius_is_positive_value(){
        Circle c = new Circle(5.5);
        Circle c1 = new Circle(7.0);
        int compareResult = c1.compareTo(c);
        Assertions.assertTrue(compareResult > 0);
    }

    @Test
    public void test_that_compare_with_equal_radius_is_zero(){
        Circle c = new Circle(5.5);
        Circle c1 = new Circle(5.5);
        int compareResult = c.compareTo(c1);
        Assertions.assertEquals(0, compareResult);
        Assertions.assertFalse(c.equals(c1));
    }
}
