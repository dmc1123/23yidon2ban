/**
 * 23移动二班
 * 2023/10/23 10：30
 * Java运算
 */

public class Asus {
    public static void main(String[] args) {

        long a = 10;//java运算
        int b = 10;
        long c = a + b;//Java加法运算
        System.out.println(c);

        int a1 = 30, t = 21;
        int c1 = a1 - t;
        int c2 = t - a1;//java减法运算
        System.out.println(c1);
        System.out.println(false);
        System.out.println("哈哈");

        int a2 = 10, a3 = 20;//java除法运算
        System.out.println(a3 / a2);
        System.out.println(a2 * a3);//java乘法运算

        boolean b5 = false;
        boolean b6 = false;
        if (b5) {
            System.out.println("b5是true");
        } else {
            System.out.println("b5是false");
        }

        int g = 30;
        int h = ++g;//先自增在赋值
        System.out.println(h);
        int h2 = g++;//先赋值在自增
        System.out.println(h2);//因为是先赋值所以没有自增

    }
}