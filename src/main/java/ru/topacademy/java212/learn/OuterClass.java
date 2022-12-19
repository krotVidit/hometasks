package ru.topacademy.java212.learn;

public class OuterClass {

    String s = "s in OuterClass";
    interface  InnerI{
        String s = "s in Interface";
        String method1();
    }
    class A1 implements InnerI{
        interface  Inter{
             String method();
        }
        @Override
        public String method1() {
            return "I'm in A1 " + s;
        }

        public String getOuterS(){
            return "I'm in A1 " + OuterClass.this.s;
        }

        public String getInterfaceS(){
            return "I'm in A1 " + InnerI.s;
        }
    }
    class A2 implements A1.Inter{
        @Override
        public String method() {
            return "I'm A2 " + s;
        }
    }
    class A3 extends A2{
        @Override
        public String method() {
            return "I'm A3 " + s;
        }
    }
}