import java.util.Scanner;

public class Main {
    public static String solve(int[] a, int n){
        int l = 0, r = n - 1;
        while(l <= r){
            if(a[l++] != a[r--])
                return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
            System.out.println(solve(arr, n));
        }
    }
}