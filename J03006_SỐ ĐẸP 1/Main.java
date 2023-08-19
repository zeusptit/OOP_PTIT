import java.util.*;

public class Main {
    public static String solve(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if((s.charAt(l) != s.charAt(r)) || ((s.charAt(l) % 2) != 0) || ((s.charAt(r) % 2) != 0)) {
                return "NO";
            }
            l++; r--;
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
4
123456787654321
86442824468
8006000444422220000222244440006008
235365789787654324567856578654356786556
 */