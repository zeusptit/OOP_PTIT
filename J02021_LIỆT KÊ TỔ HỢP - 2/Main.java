import java.util.*;

public class Main {
    static int[] X = new int[100];
    public static int count = 0;
    public static void Try(int n, int k, int i){
        for(int j = X[i - 1] + 1; j <= n; j++){
            X[i] = j;
            if(i == k){
                for(int l = 1; l <= k; l++) System.out.print(X[l]);
                count++;
                System.out.print(" ");
            }else
                Try(n, k, i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        X[0] = 0;
        Try(n, k, 1);
        System.out.println("\nTong cong co " + count + " to hop");
    }
}