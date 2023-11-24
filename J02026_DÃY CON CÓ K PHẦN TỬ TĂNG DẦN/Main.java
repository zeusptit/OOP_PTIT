import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n, k;
    static int[] a = new int[200];
    static int[] X = new int[200];
    static List<String> v = new ArrayList<>();

    public static void Try(int i, int pos) {
        for (int j = pos; j <= n; j++) {
            X[i] = a[j];
            if(i == k){
                StringBuilder sb = new StringBuilder();
                for(int l = 1; l <= k; l++)sb.append(X[l]).append(" ");
                v.add(sb.toString().trim());
            }else
                Try(i + 1, j + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            n = sc.nextInt(); k = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, 1, n + 1);
            v.clear();
            Try(1, 1);
            //Collections.sort(v);
            for (String x : v) {
                System.out.println(x);
            }
        }
    }
}