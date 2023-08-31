import java.awt.*;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        double ax = p2.x - p1.x;
        double ay = p2.y - p1.y;
        double az = p2.z - p1.z;

        double bx = p3.x - p1.x;
        double by = p3.y - p1.y;
        double bz = p3.z - p1.z;

        double nx = ay * bz - az * by;
        double ny = az * bx - ax * bz;
        double nz = ax * by - ay * bx;

        double D = -(nx * p1.x + ny * p1.y + nz * p1.z);

        double result = nx * p4.x + ny * p4.y + nz * p4.z + D;

        return result == 0;
    }
}
