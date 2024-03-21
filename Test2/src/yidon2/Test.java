package yidon2;

public class Test {
    public static void main(String[] args) {
        computer r = new computer("华为", 200);
        System.out.println(r.add(1, 2));
        System.out.println(r.add(1, 2, 1));
        r.add();
        r.cmd();
        System.out.println(r.getName());
        System.out.println(r.getPrice() + "\n");

        computer t = new computer("小米", 100);
        System.out.println(t.add(3, 2));
        System.out.println(t.add(3, 2, 1));
        t.add(7);
        t.cmd();
        System.out.println(t.getName());
        System.out.println(t.getPrice());

        /*cat r1 = new cat("黑猫", "\n黑色");
        System.out.println(r1.getColour());
        r1.Catchingmice();
        System.out.println(r1.Count(3));

        stu r2 = new stu("张三", "法外狂徒");
        System.out.println(r2.getStuNO() + r2.getName());
        r2.eat();
        System.out.println(r2.achievement(80, ""));
        r2.setName("大力王");
        r2.setStuNO("蚌埠住了");
        System.out.println(r2.getStuNO() + r2.getName());

        person r3 = new person();
        System.out.println();
        r3.hello();
        r3.hello("张三");
        r3.helloEverybody();*/
    }
}