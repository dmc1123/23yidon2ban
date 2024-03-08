/**
 * 水果类
 * 作者=杜
 * 时间=2023/10/30
 */


public class Shuiguo {
    public static void main(String[] args) {

        String a = "苹果", b = "书本", c = "西瓜";//名称
        int a1 = 3, b1 = 33, c1 = 6;//价格
        String a2 = "新疆", b2 = "第一版", c2 = "四川";//产地
        int a3 = 10, b3 = 11, c3 = 12;//数量
        char a4 = '大', b4 = '中', c4 = '小';//规格
        System.out.println("名称：" + a);
        System.out.println("价格：" + a1);
        System.out.println("产地：" + a2);
        System.out.println("数量：" + a3);
        System.out.println("规格：" + a4);
        System.out.println();

        String b5 = "新华出版社";
        String b6 = "张三";
        System.out.println("名称：" + b);
        System.out.println("版次：" + b2);
        System.out.println("价格：" + b1);
        System.out.println("出版社：" + b5);
        System.out.println("作者：" + b6);
        System.out.println();

        String a5 = "华硕笔记本";
        int a6 = 2099;
        String a7 = "ASUS";
        String a8 = "京东";
        System.out.println("名称:" + a5);
        System.out.println("价格:" + a6);
        System.out.println("品牌:" + a7);
        System.out.println("购买渠道：" + a8);
        System.out.println();

        String a9 = "23移动二班", a10 = "杜明川", a11 = "男";
        int a12 = 18;

        System.out.println("班级:" + a9);
        System.out.println("姓名：" + a10);
        System.out.println("性别：" + a11);
        System.out.println("年龄：" + a12);
        System.out.println();

        int a13 = 23;
        System.out.println(a13);
        System.out.println(--a13);
        System.out.println(++a13);
        System.out.println("__________________");

        int a14 = 15;
        System.out.println(--a14);
        System.out.println(a14++);
        System.out.println(a14);
        System.out.println(++a14);

        int a15 = 10;
        int a16 = 12;
        System.out.println(1 == 1);
        System.out.println(a15 == a16);
        System.out.println(a15 < a16);
        System.out.println(a15 <= a16);
        System.out.println(a15 > a16);
        System.out.println(a15 >= a16);
        System.out.println(a15 != a16);
        System.out.println("--------------------");

        int a17 = 10, a18 = 12, a19 = 13;
        System.out.println("结果：" + (a16 == a18));
        //==是比较相不相等
        System.out.println("结果：" + ((a18 == a17) && (a16 == a18)));
        System.out.println("结果：" + ((a18 == a17) || (a16 == a18)));
        //有一个为true则true
        System.out.println("结果：" + ((a19 < a18) && (a19 > a18)));
        //有一个为false则false
        System.out.println("结果：" + ((a19 < a18) || (a19 > a18)));
        System.out.println("--------------------");

        int a20 = 10, a21 = 12, a22 = 13;
        System.out.println("结果：" + (a20 == a21));
        System.out.println("结果：" + (a20 == a22));
        System.out.println("结果：" + (a21 == a22));
        System.out.println("--------------------");

        int q = 10, q1 = 11;
        System.out.println(q);
        q -= q1;
        System.out.println(q);//相当于q=q-q1
        q += q1;
        System.out.println(q);//相当于q=q+q1
        System.out.println("--------------------");


    }
}
