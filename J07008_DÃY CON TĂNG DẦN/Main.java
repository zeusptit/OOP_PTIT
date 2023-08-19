import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int n;
    static int[] a = new int[100];
    static int[] X = new int[100];
    static ArrayList<String> v = new ArrayList<>();

    static void Try(int i, int pos) {
        for (int j = pos; j <= n; j++) {
            X[i] = a[j];
            if (i >= 2 && X[i] > X[i - 1]) {
                StringBuilder temp = new StringBuilder();
                for (int k = 1; k <= i; k++) {
                    temp.append(X[k]).append(" ");
                }
                v.add(temp.toString());
                Try(i + 1, j + 1);
            } else if (X[i] > X[i - 1]) {
                Try(i + 1, j + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i = 1; i <= n; i++)a[i] = sc.nextInt();
        Try(1, 1);
        Collections.sort(v, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(String x : v){
            System.out.println(x);
        }
    }
}
/*

 */