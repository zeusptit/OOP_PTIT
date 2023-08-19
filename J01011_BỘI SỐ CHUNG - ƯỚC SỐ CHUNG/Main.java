import java.util.Scanner;

public class Main {
    public static long gcd(long a, long b){
        if(b == 0)return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            long a = sc.nextLong(), b = sc.nextLong();
            System.out.println((Long)a / gcd(a, b) * b + " " + gcd(a, b));
        }
    }
}