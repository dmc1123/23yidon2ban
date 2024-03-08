/**
 * 猜数字游戏
 */

import java.util.Random;
import java.util.Scanner;

public class Caishuzi {
    public static void main(String[] args) {

        int d = 0;
        Random a1 = new Random();
        System.out.println("整数100以内随机数");
        System.out.print("请输入数字：");


        int b = a1.nextInt((100) + 1);
        while (true) {
            Scanner a = new Scanner(System.in);
            int c = a.nextInt();
            if (c == 0) {
                System.out.println("退出");
                break;
            } else if (c < b) {
                System.out.println("小了");
                d++;
            } else if (c > b) {
                System.out.println("大了");
                d++;
            } else {
                System.out.println("胜利！！！");
                System.out.println("猜对了，你的猜测次数为：" + d);
                break;
            }
            if (d == 5) {
                System.out.println("猜错五次直接退出");
                break;
            }

        }


    }
}
