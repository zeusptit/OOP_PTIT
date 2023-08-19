import java.util.Scanner;

public class Main {
    public static long powMod(long a, long b, long mod){
        if(b == 0)return 1;
        if(b % 2 == 0)
            return powMod(a * a % mod, b / 2, mod) % mod;
        else
            return a * powMod(a * a % mod, b / 2, mod) % mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong(), b = sc.nextLong(), mod = (long)1e9 + 7;
            if(a == 0 && b == 0)break;
            System.out.println(powMod(a, b, mod));
        }
    }
}