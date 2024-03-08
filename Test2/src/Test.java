import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random x = new Random();
        int a = 0;
        while (true) {
            int age = (x.nextInt(125));
            System.out.println("年龄：" + age);
            a++;
            if (a == 101) {
                break;
            } else if (age == 0) {
                System.out.println("婴儿");
            } else if (age < 15) {
                System.out.println("儿童");
            } else if (age <= 24) {
                System.out.println("青年");
            } else if (age <= 44) {
                System.out.println("中年");
            } else if (age <= 64) {
                System.out.println("中老年");
            } else if (age <= 84) {
                System.out.println("老年");
            } else if (age <= 99) {
                System.out.println("老寿星");
            } else if (age <= 109) {
                System.out.println("百岁老人");
            } else {
                System.out.println("申请国家记录");
            }
            System.out.println();
            System.out.println("循环次数："+a);
        }
    }
}

