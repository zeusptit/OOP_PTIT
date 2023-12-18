import java.util.Scanner;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calculateArea(int a, int b, int c, int d, int e, int f) {
        double x = Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
        double y = Math.sqrt((e - c) * (e - c) + (f - d) * (f - d));
        double z = Math.sqrt((e - a) * (e - a) + (f - b) * (f - b));
        return Math.sqrt((x + y + z) * (x + y - z) * (y + z - x) * (z + x - y)) / 4;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
