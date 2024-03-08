/**
 * 23移动二班
 * 程序测试
 */


public class Main {
    public static void main(String[] ages) {
        char a = '\n';
        System.out.print("你好");
        System.out.println("23移动二班");
        System.out.println("\"我\nT\nM\n来\n啦\"");

        double b1 = 0.10, b2 = 0.11;

        int a1 = 10, a2 = 11, a3 = 13;
        double b3 = 0.13;
        double Y = a1 + a2 + a3 + b1 + b2 + b3;
        int U = 35;
        System.out.println(Y);
        boolean M = U < Y;
        System.out.println(M);

        a1 += a2; //a1=a1+a2
        System.out.println(a1);
        a1 -= a2; //a1=a1-a2
        System.out.println(a1);
        a1 *= a2; //a1=a1*a2
        System.out.println(a1);

        System.out.println("我他妈忍不了了"); //2023.10.17 这他们不是常识吗？？？？？？
        System.out.println("讲的什么"); //2023.10.17 ???还用讲？？？？

        //测试逻辑运算符
        boolean b4 = true;
        boolean b5 = false;
        System.out.println(b4 & b5); //与：有一个false，结果：false
        System.out.println(b4 | b5); //或：有一个true，结果：true
        System.out.println(!b4); //取反
        System.out.println(b4 ^ b5); //异或：相同false，不同true

        //短路与、短路或
        //int b6=3/0; //会报不能除于0的异常
        boolean b6 = false;
        System.out.println(b6);
        System.out.println("编程程序设计");


    }
}


