package yidon2;

public class stu {
    private String name;
    private int sex;
    private int age;
    private String stuNO;

    public stu(String name, String stuNO) {
        this.name = name;
        this.stuNO = stuNO;
    }

    public stu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNO() {
        return stuNO;
    }

    public void setStuNO(String stuNO) {
        this.stuNO = stuNO;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public String achievement(int fraction, String grade) {
        if (fraction > 90 && fraction <= 100) {
            grade = "A";
        } else if (fraction > 80 && fraction <= 90) {
            grade = "B";
        } else if (fraction > 70 && fraction <= 80) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }
}