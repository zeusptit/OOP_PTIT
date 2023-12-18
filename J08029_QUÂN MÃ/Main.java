import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static final Point[] path = {
            new Point(-2, 1), new Point(-1, 2), new Point(1, 2), new Point(2, 1),
            new Point(2, -1), new Point(1, -2), new Point(-1, -2), new Point(-2, -1)
    };

    public static int[][] visited = new int[8][8];

    public static void Try(Point start, Point end) {
        Queue<Point> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            Point temp = q.poll();
            if (temp.getX() == end.getX() && temp.getY() == end.getY()) {
                System.out.println(temp.getCount());
                return;
            }
            for (int k = 0; k < 8; k++) {
                Point nP = new Point(temp.getX() + path[k].getX(), temp.getY() + path[k].getY(), 0);
                if (nP.getX() >= 0 && nP.getX() < 8 && nP.getY() >= 0 && nP.getY() < 8 && visited[nP.getX()][nP.getY()] == 0) {
                    nP.setCount(temp.getCount() + 1);
                    q.add(nP);
                    visited[nP.getX()][nP.getY()] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            String s = scanner.next();
            String t = scanner.next();
            Point start = new Point(s.charAt(0) - 'a', s.charAt(1) - '1', 0);
            Point end = new Point(t.charAt(0) - 'a', t.charAt(1) - '1', 0);
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    visited[i][j] = 0;
                }
            }
            Try(start, end);
        }
    }
}
