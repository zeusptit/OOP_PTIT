import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), idx = 0;
        int[][] a = new int[n][n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n * n; i++)list.add(sc.nextInt());
        Collections.sort(list);
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1, d = 0;
        while(d++ <= n / 2){
            for(int i = c1; i <= c2; i++)a[h1][i] = list.get(idx++);
            h1++;
            for(int i = h1; i <= h2; i++)a[i][c2] = list.get(idx++);
            c2--;
            for(int i = c2; i >= c1; i--)a[h2][i] = list.get(idx++);
            h2--;
            for(int i = h2; i >= h1; i--)a[i][c1] = list.get(idx++);
            c1++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
2
11 22 33 44 55 66 77
23 34 45 56 67 78 89 90 121 131 141 151 161 171
 */