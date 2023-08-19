import java.util.*;

public class Main {
    public static void solve(String x, String y) {
        int temp = 0;
        while (y.length() < x.length()) {
            y = '0' + y;
        }
        while (x.length() < y.length()) {
            x = '0' + x;
        }
        if (x.compareTo(y) < 0) {
            String tempStr = x;
            x = y;
            y = tempStr;
        }
        int n = x.length();
        Vector<Integer> v = new Vector<>();
        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            int k = (x.charAt(i) - '0') - (y.charAt(i) - '0') + temp;
            if (k < 0) {
                temp = -1;
                res = (char)((k + 10) % 10 + '0') + res;
            } else {
                temp = 0;
                res = (char)(k + '0') + res;
            }
        }
        System.out.println(res);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while (test-- > 0) {
                String x, y;
                x = sc.next();
                y = sc.next();
                solve(x, y);
            }
        }
}
/*
2
978
12977
100
1000000
 */