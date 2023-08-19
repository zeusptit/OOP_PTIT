import java.util.Scanner;

public class Main {
    public static Boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n > 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt();
            if(isPrime(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}