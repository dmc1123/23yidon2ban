package com.du.innerClass;

interface A {
    void run();
}

public class TestAnonymousOuterClass {

    public static void main(String[] args) {
        TestAnonymousOuterClass a = new TestAnonymousOuterClass();
        a.test(new A() {
            @Override
            public void run() {
                System.out.println("第一个匿名内部类!");
            }
        });


    }

    public void test(A a) {
        a.run();
    }

}