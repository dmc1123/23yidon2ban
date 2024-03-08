public class MyClass {
    //    班级类
    private String classname;
    private String clsNo;
    private String major;
    private int stuNum;

    public MyClass() {
    }

    public MyClass(String classname, String clsNo, String major, int stuNum) {
        this.classname = classname;
        this.clsNo = clsNo;
        this.major = major;
        this.stuNum = stuNum;
    }

    /*public static void main(String[] args) {

        MyClass test = new MyClass("20**九班", "9", "****专业", 56);
        System.out.println(test.classname);
        System.out.println(test.clsNo);
        System.out.println(test.major);
        System.out.println(test.stuNum + "\n");

        MyClass test0 = new MyClass("20**十班", "10", "****专业", 57);
        System.out.println(test0.classname);
        System.out.println(test0.clsNo);
        System.out.println(test0.major);
        System.out.println(test0.stuNum + "\n");

        MyClass test1 = new MyClass("20**十一班", "11", "****专业", 58);
        System.out.println(test1.classname);
        System.out.println(test1.clsNo);
        System.out.println(test1.major);
        System.out.println(test1.stuNum + "\n");

        MyClass test2 = new MyClass();
        test2.setClassname("20**十二班");
        System.out.println(test2.getClassname());
        test2.setClsNo("12");
        System.out.println(test2.getClsNo());
        test2.setMajor("****专业");
        System.out.println(test2.getMajor());
        test2.setStuNum(59);
        System.out.println(test2.getStuNum());

    }*/

    public void test() {
        System.out.println(this.classname);
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getClsNo() {
        return clsNo;
    }

    public void setClsNo(String clsNo) {
        this.clsNo = clsNo;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }
}
