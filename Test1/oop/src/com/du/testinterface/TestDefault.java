package com.du.testinterface;

public interface TestDefault {      //接口

    static void print1() {       //静态方法
        System.out.println("测试静态方法！");
    }

    void printInfo();       //普通方法

    default void print() {      //默认方法
        System.out.println("TestDefault.moren");
        System.out.println("测试默认方法！");
    }
}

class Test1 implements TestDefault {        //类

    @Override
    public void printInfo() {

    }
}