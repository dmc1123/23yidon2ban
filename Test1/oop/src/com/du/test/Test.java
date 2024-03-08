package com.du.test;

public class Test {
    private int id;
    private String name;
    private boolean man;

    public void test() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(man);
    }

    public Test(int id, String name, boolean man) {
        this.id = id;
        this.name = name;
        this.man = man;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public boolean isMan() {
        return man;
    }

//    public void setMan(boolean man) {
//        this.man = man;
//    }

}
