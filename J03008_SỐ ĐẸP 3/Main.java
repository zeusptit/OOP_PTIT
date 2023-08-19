import java.util.*;

public class Main {
    public static String solve(String s){
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != s.charAt(n - i - 1))return "NO";
            if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7')return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- != 0){
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }
}
/*
3
123456787654321
235755557532
2222333355557777235775327777555533332222
 */