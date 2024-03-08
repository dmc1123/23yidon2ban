package com.du.test1;

public class Test {
    public void shout() {
        System.out.println("Hello");
    }
}

class Dog extends Test {
    public void seeDoor() {
        System.out.println("看门中......");
    }
    public void shout() {
        System.out.println("汪汪汪！");
    }
}

class cat extends Test {
    public void shout() {
        System.out.println("喵喵喵");
    }

    public void catchMouse() {
        System.out.println("抓老鼠中......");
    }
}