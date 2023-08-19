import java.math.BigInteger;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next(), b = sc.next();
            BigInteger bigInteger1 = new BigInteger(a), bigInteger2 = new BigInteger(b);
            System.out.println(bigInteger1.subtract(bigInteger2));
        }
}
/*

 */