package ru.topacademy.java212.learn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InnerInterfaceTest {

    @Test
    public void test_s_outerClass_is_accessible(){
        OuterClass ex = new OuterClass();
        OuterClass.A1.Inter a1 = ex.new A3();
        String s = a1.method();
        Assertions.assertEquals("I'm A3 s in OuterClass",s);
    }

    @Test
    public void test_s_interface_is_accessible(){
        OuterClass ex = new OuterClass();
        OuterClass.A1 a1 = ex.new A1();
        String s = a1.method1();
        Assertions.assertEquals("I'm in A1 s in Interface",s);

    }
    @Test
    public void test_get_s_from_a1(){
        OuterClass ex = new OuterClass();
        OuterClass.A1 a1 = ex.new A1();
        String sOuter= a1.getOuterS();
        Assertions.assertEquals("I'm in A1 s in OuterClass",sOuter);
        String sInter = a1.getInterfaceS();
        Assertions.assertEquals("I'm in A1 s in Interface",sInter);
    }

    @Test
    public void test_a2(){
        OuterClass ex = new OuterClass();
        OuterClass.A2 a2 = ex.new A2();
        String s = a2.method();
        Assertions.assertEquals("I'm A2 s in OuterClass",s);

    }
}
