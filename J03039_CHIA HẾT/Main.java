import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static String solve(String a, String b){
        BigInteger num1 = new BigInteger(a), num2 = new BigInteger(b);
        if(num1.mod(num2).equals(BigInteger.ZERO) || num2.mod(num1).equals(BigInteger.ZERO))return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            String a = sc.next(), b = sc.next();
            System.out.println(solve(a, b));
        }
    }
}

