package yidon2;

public class computer {
    private String name;
    private String brand;
    private String cpu;
    private String memory;
    private String storage;
    private int price;

    public computer() {
    }

    public computer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    //无返回值无参数的方法
    public void cmd() {
        System.out.println("用cmd命令控制符");
    }

    //有返回值有参数的方法
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void add() {
        System.out.println("math");
    }

    public void add(int n1) {
        System.out.println("n=" + n1);
    }


}
