import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int lowerBound(int[] a, int l, int r, int x){
        int ans = -1;
        while(l <= r){
            int m = (l + r) / 2;
            if(a[m] >= x){
                r = m - 1;
                ans = m;
            }else{
                l = m + 1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] a, int l, int r, int x){
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] <= x) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);
            long res = 0;

            for (int i = 0; i < n; i++) {
                int l = lowerBound(a, i + 1, n - 1, k - a[i]);
                if(l != -1 && a[l] == k - a[i]){
                    int r = upperBound(a, i + 1, n - 1, k - a[i]);
                    res += r - l + 1;
                }
            }

            System.out.println(res);
        }
    }
}
