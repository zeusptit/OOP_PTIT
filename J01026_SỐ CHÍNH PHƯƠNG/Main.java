import java.util.Scanner;

public class Main {
    public static String solve(int n){
        int x = (int)Math.sqrt(n);
        if(x * x == n)
            return "YES";
        else
            return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
}