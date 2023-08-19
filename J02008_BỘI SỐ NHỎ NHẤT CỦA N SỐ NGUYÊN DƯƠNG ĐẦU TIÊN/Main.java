import java.util.*;

public class Main {
    public static long lcm(long a, long b){
        long temp = 0, n = a, m = b;
        while(b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return n / a * m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt();
            long ans = 1;
            for(int i = 2; i <= n; i++){
                ans = lcm(ans, i);
            }
            System.out.println(ans);
        }
    }
}