import java.util.*;

public class Main {
        public static long gcd(long a, long b){
            if(b == 0)return a;
            return gcd(b, a % b);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while (test-- != 0) {
                long a = sc.nextLong(), ans = 0L;
                String b = sc.next();
                for(int i = 0; i < b.length(); i++){
                    ans = (ans * 10 + (b.charAt(i) - '0')) % a;
                }
                long res = gcd(ans, a);
                System.out.println(res);
            }
        }
}
/*
1
1221
1234567891011121314151617181920212223242526272829
 */