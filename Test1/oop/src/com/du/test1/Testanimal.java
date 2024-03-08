package com.du.test1;

import java.time.format.TextStyle;

public class Testanimal {
    public static void main(String[] args) {
//        animalary(new Dog());
//        animalary(new cat());

        Test animal = new Dog();    //向上转型
        animal.shout();
        Dog dog = (Dog)animal;
        dog.seeDoor();

        cat cat = new cat();
        cat.shout();
        cat.catchMouse();


    }

    static void animalary(Test a) {
        a.shout();          //可以出现多态
    }
}
