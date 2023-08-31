public class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(x - secondPoint.x, 2) + Math.pow(y - secondPoint.y, 2));
    }
    public double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

}
