import java.util.Scanner;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        super();
    }

    public static Point nextPoint(Scanner sc) {
        Point temp = new Point();
        temp.x = sc.nextDouble();
        temp.y = sc.nextDouble();
        return temp;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
