import java.util.*;

public class Main {
    static class Pair<F, S> {
        private final F first;
        private final S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public F getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        ArrayList<Pair<Integer, Integer>> vp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] != 0 && i < j) {
                    Pair<Integer, Integer> p = new Pair<>(i + 1, j + 1);
                    vp.add(p);
                }
            }
        }

        for (Pair<Integer, Integer> x : vp) {
            System.out.println("(" + x.getFirst() + "," + x.getSecond() + ")");
        }
    }
}