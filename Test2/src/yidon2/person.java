package yidon2;

public class person {
    private String name;
    private int age;
    private int sex;

    public person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void hello(String name) {
        System.out.println("Hello" + name);
    }

    public void helloEverybody() {
        System.out.println("OK,兄弟们全体目光向我看齐,我宣布个事");
    }

    public void hello() {
        System.out.println("Hello");
    }
}
