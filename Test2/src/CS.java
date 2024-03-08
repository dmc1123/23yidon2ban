import java.util.Scanner;

public class CS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("年薪计算器");
        System.out.println("请输入姓名：");
        String uname = s.nextLine();
        System.out.println("请输入性别：");
        String pwd = s.nextLine();
        System.out.println("请输入年龄：");
        int age = s.nextInt();
        System.out.println("请输入月薪：");
        int yx = s.nextInt();

        System.out.println("\n\n\n\n\n\n");
        System.out.println("年薪计算器");
        System.out.println("姓名：" + uname);
        System.out.println("性别：" + pwd);
        System.out.println("年龄：" + age);
        System.out.println("你的年薪：" + yx * 12);
    }
}
