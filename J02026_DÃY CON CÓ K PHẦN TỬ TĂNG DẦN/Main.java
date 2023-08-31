import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int solve(int[] a, int n, long X) {
        long curPrefixSum = 0;
        Map<Long, Integer> ump = new HashMap<>();
        for (int i = 0; i < n; i++) {
            curPrefixSum += a[i];
            if (curPrefixSum == X) return 1;
            if (ump.containsKey(curPrefixSum - X)) return 1;
            ump.put(curPrefixSum, i);
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt();
            long X = sc.nextLong();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if (solve(a, n, X) == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}