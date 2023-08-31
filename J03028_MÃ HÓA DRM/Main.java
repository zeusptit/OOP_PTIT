import java.util.*;

public class Main {
    public static String solve(String s){
        int n = s.length();
        int half = n / 2;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < n / 2; i++){
            sum1 += s.charAt(i) - 'A';
            sum2 += s.charAt(i + half) - 'A';
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n / 2; i++){
            int c1 = s.charAt(i) - 'A';
            int c2 = s.charAt(i + half) - 'A';
            int c = (c1 + sum1) % 26;
            c = (c + c2 + sum2) % 26;
            sb.append((char)(c + 'A'));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }
}
/*
3
EWPGAJRB
BB
TPQJDRJWSQXGRRIPXFMINTELHBJA
 */