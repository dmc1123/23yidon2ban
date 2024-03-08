/**
 * java作业13
 * 23移动2班杜明川
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入0~100的整数");
        System.out.print("我的成绩：");
        int b = a.nextInt();
        System.out.println();
//23移动2班杜明川
        if (b > 60 & b < 80) {
            System.out.println(b + ">60");
            System.out.println("及格");
        } else if (b < 60) {
            System.out.println(b + "<60");
            System.out.println("不及格");
        } else if (b == 60) {
            System.out.println(b + "=60");
            System.out.println("及格");
        } else if (b > 80 & b < 90) {
            System.out.println(b + ">80");
            System.out.println("良好");
        } else if (b == 80) {
            System.out.println(b + "=80");
            System.out.println("良好");
        } else if (b > 90) {
            System.out.println(b + ">90");
            System.out.println("优秀");
        } else {
            System.out.println(b + "=90");
            System.out.println("优秀");
        }
//23移动2班杜明川
        System.out.println();
        System.out.print("请输入1~7的整数:");
        int c = a.nextInt();

        if (c == 1) {
            System.out.print("星期一");
        } else if (c == 2) {
            System.out.print("星期二");
        } else if (c == 3) {
            System.out.print("星期三");
        } else if (c == 4) {
            System.out.println("星期四");
        } else if (c == 5) {
            System.out.println("星期五");
        } else if (c == 6) {
            System.out.println("星期六");
        } else if (c == 7) {
            System.out.println("星期日");
        }else {
            System.out.println();
            System.out.println("请输入1~7之间的整数");
        }
        System.out.println();
//23移动2班杜明川
        switch (c) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }
//23移动2班杜明川
    }
}