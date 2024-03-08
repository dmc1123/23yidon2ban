/**
 *
 */

public class Test1 {
    class Test{

    }


    /*public static void main(String[] args) {
        aa();
    }
    public static void aa() {
        System.out.println("aa");
        bb();
    }
    public static void bb() {
        System.out.println("bb");
    }*/

    /*public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long result=factorial(10);
        long endTime = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("耗时："+(endTime-startTime));
    }
    public static long factorial(long n){
        if (n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }*/


    /*public static int landleLate(int a, int b) {
        int c;
        int d;

        System.out.println("\n迟到时间：" + a);
        System.out.println("月薪：" + b);
        c = (int) (b / 22.5);
        d = 0;

        if (a <= 10) {
            System.out.println("警告！");

        } else if (a <= 20) {
            System.out.println("罚款100元！");

            d = 100;
        } else if (a <= 30) {
            System.out.println("罚款200元！");

            d = 200;
        } else if (a >= 60) {
            System.out.println("罚款3日工资！");

            d = c * 2;
        } else {
            System.out.println("罚款半日工资！");

            d = c / 3;
        }

        return d;
    }

    public static void main(String[] args) {

        int a = landleLate(30, 80000);
        int b = landleLate(30, 80000);
        int c = landleLate(30, 80000);
        int d = landleLate(30, 80000);
        int e = landleLate(30, 80000);
        System.out.println(a+b+c+d+e);

    }*/

    /*add(10, 20, 30, 40);*/





    /*public static void sayloveu() {
        System.out.println("i love you!");
        System.out.println("i love you!");
        System.out.println("i love you!");
    }

    public static int add(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println("sum:" + sum);
        return sum;     //return两个作用，返回值，结束方法运行
    }*/

        /*while (true) {
            System.out.print("请输入你的月薪：");
            double i = s.nextInt();
            double a = i - 1500 - 5000;
            double a1;

            if (a <= 0) {
                System.out.println("不需要交税");
            } else if (a > 80000) {
                a1 = i * 0.45 - 15160;
                i -= a1;
                System.out.println("缴纳后的月薪：" + i);
                System.out.println("应缴纳的税为：" + a1);
            } else if (a > 55000) {
                a1 = i * 0.35 - 7160;
                i -= a1;
                System.out.println("缴纳后的月薪：" + i);
                System.out.println("应缴纳的税为：" + a1);
            } else if (a > 35000) {
                a1 = i * 0.3 - 4410;
                i -= a1;
                System.out.println("缴纳后的月薪：" + i);
                System.out.println("应缴纳的税为：" + a1);
            } else if (a > 25000) {
                a1 = i * 0.25 - 2660;
                i -= a1;
                System.out.println("缴纳后的月薪：" + i);
                System.out.println("应缴纳的税为：" + a1);
            } else if (a > 12000) {
                a1 = i * 0.2 - 1410;
                i -= a1;
                System.out.println("缴纳后的月薪：" + i);
                System.out.println("应缴纳的税为：" + a1);
            } else if (a > 3000) {
                a1 = i * 0.1 - 210;
                i -= a1;
                System.out.println("缴纳后的月薪：" + i);
                System.out.println("应缴纳的税为：" + a1);
            } else if (a <= 3000) {
                a1 = i * 0.03;
                i -= a1;
                System.out.println("缴纳后的月薪：" + i);
                System.out.println("应缴纳的税为：" + a1);
            }
            System.out.println("\n输入88退出程序，其他继续");
            int a2 = s.nextInt();
            if (a2 == 88) {
                System.out.println("已退出");
                break;


            }

        }*/


        /*out:
        while (true) {
            System.out.print("请输入您的月薪：");
            int i = s.nextInt();
            int a = i * 12;
            System.out.println("您的年薪是：" + a);
            if (i == 66) {

            } else if (a >= 200000) {
                System.out.println("恭喜你超越98%的国人");
            } else if (a >= 100000) {
                System.out.println("恭喜你超越90%的国人");
            }
            System.out.println();

            System.out.println("输入88退出循环，66继续计算");

            while (true) {
                int d = s.nextInt();
                if (d == 88) {
                    System.out.println("已退出");
                    break out;
                } else if (d ==66) {
                    break;
                }

            }
        }*/


        /*int a = 0;
        for (int i = 100; i < 151; i++) {

            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i+"\t");
            a++;
            if (a==5){
                System.out.println();
                a=0;
            }

        }*/


        /*while (true) {
            int a = rand.nextInt(101);
            System.out.println(a);

            if (a == 88) {
                break;
            }

        }*/


        /*for (int i = 1; i < 10; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i + "*" + j + "=" + i * j + "\t");

            }
            System.out.println();
        }*/




        /*for (int b = 1; b <= 5; b++) {
            for (int a = 1; a <= 5; a++) {
                System.out.print(b + "\t");
                if (a % 5 == 0) {
                    System.out.println();
                }

            }

        }*/
        /*for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(a + "*" + b + "=" + (a * b) + "\t");


            }
            System.out.println();
        }*/

        /*for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                if ((a + b) % 2 == 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }*/

        /*Random a = new Random();
        int a1 = 0;
        while (true) {
            int b = a.nextInt(101);
            System.out.println(b);
            a1++;
            if (b == 88) {
                break;
            }

        }
        System.out.println("循环次数：" + a1 + "次");*/


}

