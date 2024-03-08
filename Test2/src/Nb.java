/**
 * 掷骰子游戏：
 * 1.如果三次的和加起来大于15，则手气不错。
 * 2.如果三次的和在 10~15之间，则手气一般。
 * 3.如果三次的和在 10以下，则手气不怎么样。
 * 作者：dumc
 * 时间：2023/11/5
 */

public class Nb {
    public static void main(String[] args) {
        double r = 4 * Math.random();
        double S = Math.PI * r * r;
        double C = 2 * Math.PI * r;

        System.out.println("半径：" + r);
        System.out.println("面积：" + S);
        System.out.println("周长：" + C);

        if (S == C) {
            System.out.println("面积等于周长！");
        } else if (S > C) {
            System.out.println("面积大于周长！");
        } else {
            System.out.println("面积小于周长！");
        }
        System.out.println();

        int a = (int) (Math.random() * 60), b = (int) (Math.random() * 60);
        int c = Math.max(a, b);
        System.out.println(a);
        System.out.println(b);
        System.out.println();
        System.out.println(c);
        System.out.println();


        if (a == b) {
            System.out.println("a等于b！");
        } else if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}
