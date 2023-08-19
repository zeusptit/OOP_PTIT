import java.math.BigInteger;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while (test-- > 0) {
                String s = sc.next();
                String t = sc.next();
                if (!s.equals(t)) {
                    System.out.println(Math.max(s.length(), t.length()));
                } else {
                    System.out.println(-1);
                }
            }
        }
}
/*
2
abcd
defgh
a
a
 */