public class Cat {
    //    猫类
    String catname;
    String color;
    double catprice;

    public Cat() {
    }

    public Cat(String catname, String color, double catprice) {
        this.catname = catname;
        this.color = color;
        this.catprice = catprice;
    }

    public static int hello(int x, int y) {

        return x;
    }

    public static void main(String[] args) {
        Cat test = new Cat("波斯猫", "黑白色", 1000);
        System.out.println(test.catname);
        System.out.println(test.color);
        System.out.println(test.catprice + "\n");
        test.eat();
        test.sleep();
        Cat test0 = new Cat("皮卡丘", "黄色", 2000);
        System.out.println(test0.catname);
        System.out.println(test0.color);
        System.out.println(test0.catprice + "\n");
        Cat test1 = new Cat("小叮当", "橘色", 3000);
        System.out.println(test1.catname);
        System.out.println(test1.color);
        System.out.println(test1.catprice + "\n");
        Cat test2 = new Cat("小花猫", "花色", 4000);
        System.out.println(test2.catname);
        System.out.println(test2.color);
        System.out.println(test2.catprice + "\n");

        Cat test3 = new Cat();
        test3.setCatname("小橘");
        System.out.println(test3.getCatname());
        test3.setColor("橘色");
        System.out.println(test3.getColor());
        test3.setCatprice(500);
        System.out.println(test3.getCatprice());
    }

    public void eat() {
        System.out.println("吃猫粮");
    }

    public void sleep() {
        System.out.println("睡懒觉");
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCatprice() {
        return catprice;
    }

    public void setCatprice(double catprice) {
        this.catprice = catprice;
    }
}
