import java.math.BigInteger;
import java.util.*;

public class Main {
    public static String solve(String s){
        if(s.charAt(0) == '0')return "INVALID";
        int no_even = 0, no_odd = 0;
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                if(x % 2 == 0)no_even++;
                else no_odd++;
            }else
                return "INVALID";
        }
        if(no_even > no_odd && s.length() % 2 == 0)return "YES";
        if(no_even < no_odd && s.length() % 2 != 0)return "YES";
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
01234aa32432432432534545b987978
1234567890123456789000
999999999999999999999999999999
 */