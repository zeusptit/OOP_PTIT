import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static long ans = (1 << 10) - 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test -- != 0) {
            long n = sc.nextLong();
            if(n == 0){
                System.out.println("Impossible");
                continue;
            }
            long temp = 0;
            for(long i = 1; i < 1000000; i++){
                long x = i * n;
                while(x > 0){
                    temp |= (1 << (x % 10));
                    x /= 10;
                }
                if(temp == ans){
                    System.out.println(i * n);
                    break;
                }
            }
        };
    }
}
