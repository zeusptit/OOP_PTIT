public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double distance(Point x, Point y){
        return Math.sqrt(Math.pow(x.getX() - y.getX(), 2) + Math.pow(x.getY() - y.getY(), 2));
    }
    public boolean valid(){
        double AB = distance(a, b), BC = distance(b, c), CA = distance(c, a);
        return (AB + BC >  CA) && (AB + CA > BC) && (BC + CA > AB);
    }
    public String getPerimeter(){
        double AB = distance(a, b), BC = distance(b, c), CA = distance(c, a);
        return String.format("%.3f", AB + BC + CA);
    }
}
