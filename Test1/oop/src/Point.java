public class Point {
    double x, y;

    Point(double _x, double _y) {
        x=_x;
        y=_y;
    }

    public double distance(Point O) {
        return Math.sqrt((x - O.x) * (x - O.x) + (y - O.y) * (y - O.y));
    }

    public static void main(String[] args) {
        Point p1 = new Point(13, 13);
        Point a = new Point(0, 0);
        System.out.println(p1.distance(a));
    }
}
