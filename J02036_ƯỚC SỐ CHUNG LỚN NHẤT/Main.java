import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int lcm(int a, int b){
        int m = a, n = b;
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return m / a * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            int n = sc.nextInt();
            int[] a = new int[n], b = new int[n + 1];
            for(int i = 0; i < n; i++)a[i] = sc.nextInt();
            b[0] = a[0];
            b[n] = a[n - 1];
            for(int i = 1; i < n; i++){
                b[i] = lcm(a[i - 1], a[i]);
            }
            for(int i : b)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
/*
2
29T1–123.45
29T1–555.55
 */