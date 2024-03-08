import java.util.Random;

/**
 * switch和if else语句
 */
public class Testswitch {
    public static void main(String[] args) {
        Random rand = new Random();
        int mon = rand.nextInt(13);
        switch (mon) {
            case 1:
                System.out.println("一月");
                break;
            case 2:
                System.out.println("二月");
                break;
            case 3:
                System.out.println("三月");
                break;
            case 4:
                System.out.println("四月");
                break;
            case 5:
                System.out.println("五月");
                break;
            case 6:
                System.out.println("六月");
                break;
            case 7:
                System.out.println("七月");
                break;
            case 8:
                System.out.println("八月");
                break;
            case 9:
                System.out.println("九月");
                break;
            case 10:
                System.out.println("十月");
                break;
            case 11:
                System.out.println("十一月");
                break;
            case 12:
                System.out.println("十二月");
                break;
        }
        if (mon == 1) {
            System.out.println("一月");
        } else if (mon == 2) {
            System.out.println("二月");
        } else if (mon == 3) {
            System.out.println("三月");
        } else if (mon == 4) {
            System.out.println("四月");
        } else if (mon == 5) {
            System.out.println("五月");
        } else if (mon == 6) {
            System.out.println("六月");
        } else if (mon == 7) {
            System.out.println("七月");
        } else if (mon == 8) {
            System.out.println("八月");
        } else if (mon == 9) {
            System.out.println("九月");
        } else if (mon == 10) {
            System.out.println("十月");
        } else if (mon == 11) {
            System.out.println("十一月");
        } else {
            System.out.println("十二月");
        }

    }
}
