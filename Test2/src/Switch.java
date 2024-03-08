public class Switch {
    public static void main(String[] args) {
        int age = (int) (Math.random() * 12 + 1);

        switch (age) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("月份：" + age + "  上半年");
                break;
            default:
                System.out.println("月份：" + age + "  下半年");
                break;

        }
    }
}
