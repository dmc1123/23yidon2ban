public class Car {
    //    汽车类
    String carname;
    String brand;
    double price;
    String type;

    public Car() {
    }

    public Car(String carname, String brand, double price, String type) {
        this.carname = carname;
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    public static void main(String[] args) {
        Car test = new Car("P7i", "小鹏汽车", 33.99, "新能源");
        System.out.println(test.carname);
        System.out.println(test.brand);
        System.out.println(test.price);
        System.out.println(test.type + "\n");

        Car test0 = new Car("M9 Ultra", "问界汽车", 56.98, "新能源");
        System.out.println(test0.carname);
        System.out.println(test0.brand);
        System.out.println(test0.price);
        System.out.println(test0.type + "\n");

        Car test1 = new Car("CS75 PLUS", "长安汽车", 15.49, "油车");
        System.out.println(test1.carname);
        System.out.println(test1.brand);
        System.out.println(test1.price);
        System.out.println(test1.type + "\n");

        Car test2 = new Car("炮", "长城汽车", 29, "油车");
        System.out.println(test2.carname);
        System.out.println(test2.brand);
        System.out.println(test2.price);
        System.out.println(test2.type + "\n");

        Car test3 = new Car("秦PLUS", "比亚迪汽车", 17.98, "混合动力");
        System.out.println(test3.carname);
        System.out.println(test3.brand);
        System.out.println(test3.price);
        System.out.println(test3.type + "\n");


        Car test4 = new Car();
        test4.setCarname("SU 7");
        System.out.println(test4.getCarname());
        test4.setBrand("小米");
        System.out.println(test4.getBrand());
        test4.setPrice(19.99);
        System.out.println(test4.getPrice());
        test4.setType("新能源");
        System.out.println(test4.getType());
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

    /*public static int gz(int a2, int a3, int a4, int a5, int a6) {
        int[] a = new int[]{a2, a3, a4, a5, a6};
        int sum = a[0] + a[1] + a[2] + a[3] + a[4];
        return sum / 5;
    }

    public static int sjs() {
        return (int) (Math.random() * 100 + 1);
    }

    public static int sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static int a(int a, int b) {
        return a + b;
    }

    public static int aa(int a, int b) {
        return a * b;
    }

    public static int aaa(int a, int b) {
        return (a + b) - (a + b) * (a + b) / (a + b);
    }

    public static void number() {
        int a = (int) (Math.random() * 2 + 1);
        switch (a) {
            case 1:
                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i + "*" + j + "=" + i * j + "\t");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 9; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i + "+" + j + "=" + (i + j) + "\t");
                    }
                    System.out.println();
                }
                break;
        }
    }

    public static void number0() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void number1() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "+" + j + "=" + (i + j) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("月平均工资：" + gz(2000, 2500, 4300, 3200, 3800));
        System.out.println("随机生成1~100的数：" + sjs());
        System.out.println("计算1~100的累加：" + sum());
        System.out.println("加法运算的结果：" + a(10, 10));
        System.out.println("乘法运算的结果：" + aa(10, 10));
        System.out.println("加减乘除运算的结果：" + aaa(10, 10));
        System.out.println("九九乘法表：");
        number0();
        System.out.println();
        System.out.println("九九加法表：");
        number1();
        System.out.println();
        System.out.println("随机九九乘法加法表：");
        number();
    }
}*/

/*
 * 作业名称：数组
 * 周次：16
 * 作业要求格式：
 * 1.截图代码及运行效果到word上，截图打自己的标识水印，
 * word命名格式  班级-周次-序号后2位-姓名-作业名称.doc
 * 例如：  232移动-16-08-张海鹏-数组.doc
 * 2.周四之前完成交学委 ，学委上交老师邮箱wnetx126@126.com
 * 作业内容：
 * 1.1.求平均工资：一个实习生在一家汽车维修店 2月工资3000,3月工资2500,4月工资4300,5月工资3200,6月工资3800
 * 要求：1.把工资数据存储到数组中
 * 2.求出月平均工资
 * 1.2.求平均成绩：
 * 要求：1.一个学生的课程成绩 语文118，数学108，英语115，物理95， 化学92，历史98，思政90，生物 96，通过控制台键盘输入成绩，并存储到数组中
 * 具体可以参考 学习通 \资料\2023\Test7
 * 2.求改学生平均成绩。
 * 1.3. 写个石头剪刀布的游戏   电脑随机生成 1,2,3个数字的某一个 ，用户在控制台中输入 1,2,3个数字的某一个  ,2个数字按照规则比较
 * 要求：1.1 代表石头，2代表剪刀，3代表布
 * 2. 统计10次猜拳后 玩家和电脑对战的胜率
 * 3. 当控制台
 * 规则： 以玩家的角度看胜负
 * 1.当玩家输入数字 playerNum  电脑随机生成数字为computerNum
 * 胜利条件：1-2==-1 || 2-3==-1  || 3-1==2     注释：石头对剪刀为1-2;  剪刀对布 2-3; 布对石头 3-1
 * 平局条件：playerNum==computerNum
 * 失败条件：1-3==2 || 2-1==1 || 3-2==1        注释： 石头对布为1-3；  剪刀对石头2-1；布对剪刀 3-2
 * 2.当玩家输入0，退出程序
 *//*

public class Du {
    int sum = 0;
    int[] a = new int[5];
    int[] ac = new int[8];
    Scanner achievement1 = new Scanner(System.in);
    Random r = new Random();
    double time = 0;

    public static void main(String[] args) {
        Du pay = new Du();
        pay.AVG();
        Du chengji = new Du();
        chengji.achievement3();
        Du RPS = new Du();
        RPS.RPS();
    }

    public void AVG() {
        System.out.println("2月工资3000,3月工资2500,4月工资4300,5月工资3200,6月工资3800");

        for (int i = 0; i < a.length; i++) {
            a[i] = achievement1.nextInt();
            sum += a[i];
            System.out.println("平均工资:" + sum / (i + 1));
        }
    }

    public void achievement3() {
        System.out.println("请输入:118,108,115,95,92,98,90,96");
        for (int i = 0; i < ac.length; i++) {
            ac[i] = achievement1.nextInt();
            sum += ac[i];
            double AVG = (double) sum / (i + 1);
            System.out.println("学生平均成绩:" + AVG);
        }
    }

    public void RPS() {
        System.out.println("\n石头剪刀布游戏\t数字1代表石头\t数字2代表剪刀\t数字3代表布");
        System.out.println("请输入1,2,3数字");
        out:
        for (int i = 0; i < 10; i++) {
            int computerNum = r.nextInt(3) + 1;
            int playerNum = achievement1.nextInt();
            if (computerNum == 2 & playerNum == 1 || computerNum == 3 & playerNum == 2 || computerNum == 1 & playerNum == 3) {
                System.out.println("你赢了,继续！");
                time++;
            } else if (computerNum == 1 & playerNum == 2 || computerNum == 2 & playerNum == 3 || computerNum == 3 & playerNum == 1) {
                System.out.println("你输了,再来一次！");
            } else {
                System.out.println("重来！");
            }
            if (playerNum == 0) {
                break out;
            }
        }
        System.out.println("你战胜电脑的胜利:" + (time / 10) * 100 + "%");
    }
*/






    /*public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1到100所有奇数的累加和是：" + sum);

        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 300; i > 0; i--) {
            if (i % 19 == 0) {
                System.out.println("300以内能被19整除的最大正整数是：" + i);
            }
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + "\t");
        }

        System.out.println();
        System.out.println("----学生信息管理系统----");
        System.out.println("info：----学生基本信息管理----");
        System.out.println("score：----学生成绩管理----");
        System.out.println("quit：----退出系统----");
        System.out.println("---------------------------------");
        out:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("main>");
            String choice = sc.next();
            switch (choice) {
                case "info":
                    System.out.println("学生基本信息管理...");
                    break;
                case "score":
                    System.out.println("学生成绩管理...");
                    break;
                case "quit":
                    System.out.println("0");
                    break out;
                default:
                    System.out.println("输入错误！！！");
            }
        }

        System.out.println();
        System.out.println("----学生基本信息管理----");
        System.out.println("load：----导入学生信息----");
        System.out.println("show：----显示学生信息----");
        System.out.println("add：----添加学生信息----");
        System.out.println("delete：----删除学生信息----");
        System.out.println("modify：----修改学生信息----");
        System.out.println("save：----导出学生信息----");
        System.out.println("return：----返回----");
        System.out.println("---------------------------------");
        out:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("info>");
            String choice = sc.next();
            switch (choice) {
                case "load":
                    System.out.println("导入学生信息...");
                    break;
                case "show":
                    System.out.println("显示学生信息...");
                    break;
                case "add":
                    System.out.println("添加学生信息...");
                    break;
                case "delete":
                    System.out.println("删除学生信息...");
                    break;
                case "modify":
                    System.out.println("修改学生信息...");
                    break;
                case "save":
                    System.out.println("导出学生信息...");
                    break;
                case "return":
                    break out;
                default:
                    System.out.println("输入错误！！！");
            }
        }

        System.out.println();
        System.out.println("----学生成绩管理----");
        System.out.println("avg：----课程平均分----");
        System.out.println("max：----课程最高分----");
        System.out.println("min：----课程最低分----");
        System.out.println("fails：----不及格人数----");
        System.out.println("return：----返回----");
        System.out.println("---------------------------------");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("score>");
            String choice = sc.next();
            switch (choice) {
                case "avg":
                    System.out.println("课程平均分...");
                    break;
                case "max":
                    System.out.println("课程最高分...");
                    break;
                case "min":
                    System.out.println("课程最低分...");
                    break;
                case "fails":
                    System.out.println("不及格人数...");
                    break;
                case "return":
                    return;
                default:
                    System.out.println("输入错误！！！");
            }
        }
    }*/

    /*
    //      23移动2班杜明川
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
//        Random r = new Random();
//      23移动2班杜明川
        System.out.print("请输入数字（1~12）：");
        int i = x.nextInt();
        switch (i) {
            case 1:
                System.out.println("香菇滑鸡");
                break;//23移动2班杜明川
            case 2:
                System.out.println("烤鸭");
                break;//23移动2班杜明川
            case 3:
                System.out.println("鱼香肉丝");
                break;//23移动2班杜明川
            case 4:
                System.out.println("宫保鸡丁");
                break;//23移动2班杜明川
            case 5:
                System.out.println("麻婆豆腐");
                break;//23移动2班杜明川
            case 6:
                System.out.println("炒面");
                break;//23移动2班杜明川
            case 7:
                System.out.println("烤串");
                break;//23移动2班杜明川
            case 8:
                System.out.println("拔丝苹果");
                break;//23移动2班杜明川
            case 9:
                System.out.println("糖醋排骨");
                break;//23移动2班杜明川
            case 10:
                System.out.println("红烧肉");
                break;//23移动2班杜明川
            case 11:
                System.out.println("饺子");
                break;//23移动2班杜明川
            case 12:
                System.out.println("麻辣烫");
                break;//23移动2班杜明川
        }
        System.out.println();
//        23移动二班杜明川

//        作业二 For循环

        int p = 0;
        for (int o = 0; o < 101; o++) {
            p += o;
            System.out.print("第" + o + "次累加：");
            System.out.println(p);
        }
        System.out.println();

        int p1 = 0;
        int p2 = 0;
        for (int o = 2; o < 101; o += 2) {
            p1 += o;
            p2++;
            System.out.print("第" + p2 + "次偶数累加：");
            System.out.println(p1);
        }




        /*for (int b = 1; b < 100; b++) {
            int a = r.nextInt(101);
            System.out.println("第" + b +"个数字:"+ a);
        }*/



        /*System.out.print("请输入1~7的整数：");
        int a = x.nextInt();

        switch (a) {
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
        System.out.println();*/


        /*System.out.println("一个月有多少天");
        System.out.println("请输入月份");
        int b = x.nextInt();
        switch (b) {
            case 1,3,5,7,8,10,12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 4,6,9,11:
                System.out.println("30");
                break;


        }*/





        /*System.out.print("请输入0~100的整数:");
        int b = x.nextInt();

        if (b >= 90) {
            System.out.println("A");
        } else if (b >= 80) {
            System.out.println("B");
        } else if (b >= 70) {
            System.out.println("C");
        } else if (b >= 60) {
            System.out.println("D");
        } else
            System.out.println("E");*/

