package com.du.testinterface;

interface A {
    void testA();
}

interface B {
    void testB();
}

interface C extends A, B {
    void testC();
}

class CImpl01 implements C {

    @Override
    public void testA() {
        System.out.println("CImpl01.testA");
    }

    @Override
    public void testB() {
        System.out.println("CImpl01.testB");
    }

    @Override
    public void testC() {
        System.out.println("CImpl01.testC");
    }
}

//接口的多继承
public class TestMultipleInheritance {
    public static void main(String[] args) {
        C c = new CImpl01();
        c.testC();
        c.testA();
        c.testB();
    }
}





