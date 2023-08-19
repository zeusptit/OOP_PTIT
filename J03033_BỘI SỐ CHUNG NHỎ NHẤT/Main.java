import java.math.BigInteger;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test-- != 0){
                String a = sc.next(), b = sc.next();
                BigInteger bigInteger1 = new BigInteger(a), bigInteger2 = new BigInteger(b);
                BigInteger gcd = bigInteger1.gcd(bigInteger2);
                BigInteger lcm = bigInteger1.multiply(bigInteger2).divide(gcd);
                System.out.println(lcm);
            }
        }
}
/*

 */