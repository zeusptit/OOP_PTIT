import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long ans = 0L, sum = 1L;
        for(int i = 1; i <= n; i++){
            sum *= i;
            ans += sum;
        }
        System.out.println(ans);
    }
}