import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        ArrayList<Integer>[] adj = new ArrayList[1001];
        for (int i = 1; i <= 1000; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] != 0 && i < j) {
                    adj[i + 1].add(j + 1);
                    adj[j + 1].add(i + 1);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("List(" + i + ") = ");
            for (int x : adj[i]) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}