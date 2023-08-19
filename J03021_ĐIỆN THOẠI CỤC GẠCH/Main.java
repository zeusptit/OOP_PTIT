import java.math.BigInteger;
import java.util.*;

public class Main {
    public static String solve(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l++) != s.charAt(r--))return "NO";
        }
        return "YES";
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test-- != 0){
                String s = sc.next();
                s = s.toUpperCase();
                StringBuilder sb = new StringBuilder();
                for(char x : s.toCharArray()){
                    if(x == 'A' || x == 'B' || x == 'C') sb.append('2');
                    if(x == 'D' || x == 'E' || x == 'F') sb.append('3');
                    if(x == 'G' || x == 'H' || x == 'I') sb.append('4');
                    if(x == 'J' || x == 'K' || x == 'L') sb.append('5');
                    if(x == 'M' || x == 'N' || x == 'O') sb.append('6');
                    if(x == 'P' || x == 'Q' || x == 'R' || x == 'S') sb.append('7');
                    if(x == 'T' || x == 'U' || x == 'V') sb.append('8');
                    if(x == 'W' || x == 'X' || x == 'Y' || x == 'Z') sb.append('9');
                }
                System.out.println(solve(sb.toString()));
            }
        }
}
/*

 */