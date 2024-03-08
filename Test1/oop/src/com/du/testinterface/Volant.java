package com.du.testinterface;

public interface Volant {

    int fly_hight = 100;

    void fly();

}

interface Honest {
    void helpOther();
}

class GoodMan implements Honest {

    @Override
    public void helpOther() {
        System.out.println("扶老奶奶过马路!");
    }
}

class BirdMan implements Honest {

    @Override
    public void helpOther() {
        System.out.println("我在飞");
    }
}

class Angel implements Volant, Honest {

    @Override
    public void fly() {
        System.out.println("Angel.fly!");
    }

    @Override
    public void helpOther() {
        System.out.println("Angle.helpOther");
    }
}

class Plane implements Volant {

    @Override
    public void fly() {
        System.out.println("飞机,在飞");
    }
}

