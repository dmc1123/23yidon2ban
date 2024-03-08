/**
 * 爱心代码
 */
public class You {

    public static void main(String[] args) {
        float x, y, a;
        for (y = 1.3F; y > -1.1F; y -= 0.06F) {
            for (x = -1F; x <= 1.2F; x += 0.025F) {
                a = x * x + y * y - 1;
                System.out.print(a * a * a - x * x * y * y * y <= 0.0F ? ' ' : '$');
            }
            System.out.println();


        }
    }
}