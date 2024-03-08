/**
 * 程序描述
 * 基本数据类型
 * 程序作者：du
 * 程序时间：2023/10/27
 */

public class Nb2 {
    public static <floar> void main(String[] args) {

        //定义 byte,short,int,long
        //变量名称命名规则：必须以字母、下划线、$符号开头
        byte a = 127;
        short a1 = 32767;
        int a2 = 23;
        long a3 = 111111;

        //定义浮点数
        double b = 2.5442222;
        double b1 = 3.5212122;
        float b2 = 3.11F;
        System.out.println(b);
        System.out.println(b1);
        System.out.println(a);

        //boolean 布尔值
        boolean eat = true;
        System.out.println(eat);

        //字符char
        char sex1 = 'a';
        char sex2 = 'b';

        //字符串string
        String name = "张三";
        System.out.println("名字：" + name);

        //关系运算符
        int a4 = 3, b3 = 4;
        boolean c = a4 > b3;
        System.out.println(c);

        char d = 'h';//char值位于0~65536之间，可以通过（int）强制转型成数字
        System.out.println((int) d);
        boolean e = d > 100;
        System.out.println(e);

    /* 逻辑运算符 与运算 或运算
        与运算是做了很多好事但只要中间做错一件事就G了 ✓✓✓✕–→✕
        或运算和与运算相反 ✕✕✕✓–→✓
    */
        boolean b4 = true, b5 = false;
        System.out.println(b4 & b5);//与 有一个为false就是false 都是true就是true
        System.out.println(b4 | b5);//或 有一个为true就是true 都是false就是false
        System.out.println(!b5);//取反 false取反就是true相反
        System.out.println(b4 ^ b5);//异或 相同为false不同为true

        boolean b6 = false;
        System.out.println(b6);

        //位运算符
        int a5 = 7, b7 = 8; //7对应二进制是0111，8对于二进制是1000

        System.out.println(a5 & b7);
/*
        0111  因为与是只要有一个false就是false
        1000  所以1是true，0是false
        ————  都是false
        0000
*/
        System.out.println(a5 | b7);
/*
        0111  因为或是只要有一个true就是true
        1000  所以1是true，0是false
        ————  都是true
        1111
*/
        System.out.println(a5 ^ b7);
/*
        0111  因为异或相同为false不同为true
        1000  所以都是true，都不相同
        ————
        1111
*/
        System.out.println(~b7);

        //移位
        //乘以2，除以2，用移位操作，最快！！！
        int a6 = 5 << 1; //左移1位相当于*2
        System.out.println(a6);
        System.out.println(40 >> 3); //右移1位相当于/2取商

        //字符串连接符的用法
        String a7 = "3";
        int b8 = 4;
        System.out.println(a7 + b8);

        //条件是String，不是char。若是char，则仍然是加法
        char c1 = 'h', c2 = 'i';
        System.out.println(c1 + c2);
        System.out.println(" " + c1 + c2); //想要把+变为连接符就要加一个空字符串

        //条件运算符
        int score = 90;
        String a8 = score < 60 ? "不及格" : "及格";
        System.out.println(a8);

        if (score < 60) {
            a8 = "不及格";
        } else {
            a8 = "及格";
        }

        int x = -100;
        int flag = x > 0 ? 1 : (x == 0 ? 0 : -1);
        System.out.println(flag);

        //优先级问题的用法
        boolean s1 = true, s2 = true, s3 = false;
        System.out.println(s1 || s2 && s3);

        //建议使用小括号组织表达式
        boolean s4 = true;
        System.out.println(s4);

        //数据类型的转换
        //容量小的类型可以自动转换成容量大的类型
        int a9 = 2345;
        long b9 = a9;
        //int c=b; //long类型不能自动转换成int类型
        double d1 = b;
        //float f=b;

        //特例：整型常量是int类型，但是可以自动转成：byte/short/char
        //只要不超过对应类型的表数范围
        byte h1 = 123;
        //byte h2=1234; 1234超过了byte的表数范围

        char h3 = 97 + 25;
        System.out.println(h3);

        //强制类型转换
        double a10 = 3.1415921; //浮点数强转为整数，直接丢失小数部分
        System.out.println((int) a10);

        int a11 = 97;
        System.out.println((char) a11);

        byte a12 = (byte) 300;
        System.out.println(a12);

        double a13 = 11.22231312312;
        System.out.println((float) a13);

        //强制类型转换
        //常见错误之：溢出
        int money = 1000000000;
        int years = 20;
        int total = money * years;
        System.out.println("total:" + total);
        long total1 = (long) money * years;//money和years相乘已经溢出了
        System.out.println("total1:" + total1);
        long total2 = ((long) money) * years;//先将其中一个值转换成loog再去相乘，结果就是long
        System.out.println("total2:" + total2);
        System.out.println("total3:" + (long) money * years);//相乘一个long类型也可以


    }
}
