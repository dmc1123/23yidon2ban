package com.du.innerClass;

class Outer1 {
    private static int b = 20;
    private int a = 10;

    static class Inner {
        public void test() {
            //System.out.println(a);
            System.out.println(b);
        }
    }
}

public class TeststaticOuterClass {
    public static void main(String[] args) {
        Outer1.Inner a = new Outer1.Inner();
        a.test();
    }
}
