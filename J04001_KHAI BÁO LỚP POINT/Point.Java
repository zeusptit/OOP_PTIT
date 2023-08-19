public class Point {
    private double x, y, dist;
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public double distance(Point secondPoint){
        return Math.sqrt((Math.pow(this.x - secondPoint.x, 2)) + (Math.pow(this.y - secondPoint.y, 2)));
    }
    public double distance(Point a, Point b){
        return Math.sqrt((Math.pow(a.x - b.x, 2)) + (Math.pow(a.y - b.y, 2)));
    }

    @Override
    public String toString() {
        return String.format("%.4f",dist);
    }
}