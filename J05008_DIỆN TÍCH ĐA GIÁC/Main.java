import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            Point[] P = new Point[1000];
            for (int i = 0; i < n; i++) {
                P[i] = new Point(sc.nextInt(), sc.nextInt());
            }
            double s = 0;
            for (int i = 1; i < n - 1; i++) {
                s += P[i].calculateArea(P[0].getX(), P[0].getY(), P[i].getX(), P[i].getY(), P[i + 1].getX(), P[i + 1].getY());
            }
            System.out.printf("%.3f\n", s);
        }
    }
}

/*
2
3
0 0
1 0
0 1
4
0 0
2 0
2 2
0 2
 */