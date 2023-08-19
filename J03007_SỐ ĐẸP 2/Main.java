import java.util.*;

public class Main {
    public static String solve(String s){
        int n = s.length(), sum = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != s.charAt(n - i - 1))return "NO";
            sum += s.charAt(i) - '0';
        }
        if(sum % 10 != 0 || s.charAt(n - 1) != '8')return "NO";
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
4
123456787654321
8644281154664511824468
8006000444400000000000044440006008
82123400000000000000000000000432128
 */