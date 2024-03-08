package com.du.testinterface;

public class Test {
    public static void main(String[] args) {
        Angel a = new Angel();
        a.fly();
        a.helpOther();

        System.out.println(Volant.fly_hight);

        Volant a2 = new Angel();


        System.out.println("================================================");
        Test1 a1 = new Test1();
        a1.printInfo();
        a1.print();

        System.out.println("================================================");
        TestDefault.print1();
    }
}
