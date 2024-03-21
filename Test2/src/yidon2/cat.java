package yidon2;

public class cat {
    int i;
    int c = 0;
    boolean f1;
    private String name;
    private String colour;

    public cat(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public cat() {
    }

    public void Catchingmice() {
        System.out.println("抓mice");
        i = (int) (Math.random() * 10);
    }

    public boolean Count(int f) {
        if (i >= f) {
            System.out.println(i + "完成");
            f1 = true;
        } else {
            System.out.println(i + "没完成");
            f1 = false;
        }
        return f1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
