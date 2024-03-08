/**
 * 计算BMI健康
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);//键入身高体重
        DecimalFormat df = new DecimalFormat(".00");//小数点后两位


        System.out.println("计算BMI健康标准");
        System.out.println("""
                分类 BMI 范围
                偏瘦 <= 18.4
                正常 18.5 ~ 23.9
                过重 24.0 ~ 27.9
                肥胖 >= 28.0
                """);
        System.out.println();
        System.out.println("输入数字");
        System.out.print("请输入你的身高：");

        double b = a.nextInt();
        System.out.println("cm");
        System.out.print("请输入你的体重：");

        double c = a.nextInt();//c是体重
        System.out.println("kg");
        double d = c / b / b * 10000;

        System.out.println("你的BMI为：" + (df.format(d)));//d是BMI


        if (d >= 28) {
            System.out.println("你的范围是：肥胖");
        } else if (d >= 24) {
            System.out.println("你的范围是：过重");
        } else if (d > 18.5) {
            System.out.println("你的范围是：正常");
        } else if (d <= 18.4) {
            System.out.println("你的范围是：偏瘦");
        }

        int d1;
        for (double x = 0; x < 80; ++x) {
            d1 = (int) (x / b / b * 10000);
            if (d1 == 21) {
                System.out.println("你的理想体重范围是：" + x);
            }
        }

    }
}