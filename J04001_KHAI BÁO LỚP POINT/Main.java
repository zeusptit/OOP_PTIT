import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble()), b = new Point(sc.nextDouble(), sc.nextDouble());
            a.setDist(a.distance(b));
            System.out.println(a);
        }
    }
}