public class Testtt {
    public static void main(String[] args) {
        Testt.human r = new Testt.human();
        Testt.student t = new Testt.student("dumingchuan", 18, "202301191211", 80.1);
        Testt.student t1 = new Testt.student("dumingchuan", 18, "202301191211", 80.1);
        Testt.student t2 = new Testt.student("dumingchuan", 18, "202301191211", 80.1);
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getId());
        System.out.println(t.getTizon());
        r.eat();
        r.move();
        r.sleep();
        Testt.jiqi r1 = new Testt.jiqi();
        Testt.phone y = new Testt.phone("motorola edge s30", "黑色", 2199, "骁龙888+", "UFS3.1 8G", "LPDDR5 256G");
        Testt.phone y1 = new Testt.phone("motorola edge s30", "黑色", 2199, "骁龙888+", "UFS3.1 8G", "LPDDR5 256G");
        Testt.phone y2 = new Testt.phone("motorola edge s30", "黑色", 2199, "骁龙888+", "UFS3.1 8G", "LPDDR5 256G");
        System.out.println(y.getName());
        y.setName("x30");
        System.out.println(y.getName());
        System.out.println(y.getColor());
        System.out.println(y.getCPU());
        System.out.println(y.getPrice());
        System.out.println(y.getCuncu());
        r1.call();
        r1.kaiji();
        r1.photo();
        Testt.human a = new Testt.animal();
        a.sleep();
        a.eat();
    }
}
