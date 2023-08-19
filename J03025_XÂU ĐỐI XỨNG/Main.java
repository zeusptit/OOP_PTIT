import java.math.BigInteger;
import java.util.*;

public class Main {
    public static String solve(String s){
        int l = 0, r = s.length() - 1, count = 0;
        while(l <= r){
            if(s.charAt(l++) != s.charAt(r--))count++;
        }
        if(s.length() % 2 == 0 && count == 1)return "YES";
        if(s.length() % 2 != 0 && count <= 1)return "YES";
        return "NO";
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test-- != 0){
                String s = sc.next();
                System.out.println(solve(s));
            }
        }
}
/*
3
abccaa
abbcca
abcda
 */