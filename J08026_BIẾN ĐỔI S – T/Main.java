import java.util.*;

public class Main {
    public static int solve(int s, int t){
        if(s >= t) return s - t;
        if(t % 2 == 1) return 1 + solve(s, t + 1);
        return 1 + solve(s, t >> 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            System.out.println(solve(sc.nextInt(), sc.nextInt()));
        }
    }
}