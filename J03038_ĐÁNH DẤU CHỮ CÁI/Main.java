import java.math.BigInteger;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            HashSet<Character> set = new HashSet<>();
            for(char x : s.toCharArray()){
                set.add(x);
            }
            System.out.println(set.size());
        }
}
/*

 */