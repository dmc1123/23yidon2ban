package com.du.innerClass;

public class TestInner {
    public static void main(String[] args) {
        Outer a = new Outer();
        a.show();
        Outer.Inner a1 = new Outer().new Inner();
        a1.show();
    }
}
