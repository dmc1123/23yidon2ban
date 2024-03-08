import java.util.Date;

public class Java {
    //动物类
    String Dogname;
    String Doggender;
    String Dogcolor;
    int Dogage;
    //学生类
    String name;
    String stuNo;
    int age;
    //书本类
    String author;
    String Bookname;
    String publish;
    int price;


    public static void main(String[] args) {
        Main Dog = new Main();
        Dog.name("大黑狗");

        Date data = new Date();
        System.out.printf("%tF %tR", data, data);

        Java s = new Java();

        System.out.println("\n学生类:");
        //学生类
        System.out.println(s.getName());
        System.out.println(s.getStuNo());
        System.out.println(s.getAge());
        s.Study();
        s.Study(10, 20);

        System.out.println("\n书本类:");
        //书本类
        System.out.println(s.getAuthor());
        System.out.println(s.getBookname());
        System.out.println(s.getPublish());
        System.out.println(s.getPrice());
        s.Book();

        System.out.println("\n动物类:");
        //动物类

        System.out.println(s.getDoggender());
        System.out.println(s.getDogcolor());
        System.out.println(s.getDogage());
    }

    public void setDogname(String dogname) {
        Dogname = dogname;
    }

    public String getDoggender() {
        return Doggender = "雄性";
    }

    public String getDogcolor() {
        return Dogcolor = "黑色";
    }

    public int getDogage() {
        return Dogage = 8;
    }

    public String getName() {
        return name = "小米";
    }

    public String getStuNo() {
        return stuNo = "00000000";
    }

    public int getAge() {
        return age = 20;
    }

    public void Study() {
        name = "小明";
        stuNo = "1234567";
        age = 18;
        System.out.println("正在学习");
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
    }

    public void Study(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    //职业选手类
    public void Book() {
        author = "uzi";
        Bookname = "射手";
        publish = "英雄联盟";
        price = 100;
        System.out.println("看书中");
    }


    //选手类
    //java模型
    public String getAuthor() {
        return author = "小虎";
    }

    public String getBookname() {
        return Bookname = "打野";
    }

    public String getPublish() {
        return publish = "英雄联盟";
    }

    public int getPrice() {
        return price = 200;
    }


}
