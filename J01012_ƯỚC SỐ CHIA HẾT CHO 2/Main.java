import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt(), i = 1, ans = 0;
            while(i <= n / i){
                if(((n % i) == 0) && ((i % 2) == 0))ans++;
                if((n % i == 0) && ((n / i) % 2 == 0))ans++;
                if(i * i == n && n % 2 == 0)ans--;
                i++;
            }
            System.out.println(ans);
        }
    }
}