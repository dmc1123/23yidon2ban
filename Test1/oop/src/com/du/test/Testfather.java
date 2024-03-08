package com.du.test;

public class Testfather {
    public static void main(String[] args) {
        Test t = new Test(1211,"dumc",true);
//        t.setId(1211);
//        t.setName("杜明川");
//        t.setMan(true);
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.isMan());
    }
}
