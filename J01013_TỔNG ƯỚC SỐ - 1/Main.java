import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] isPrime = new int[2000005];
        isPrime[0] = isPrime[1] = 1;
        for(int i = 2; i <= 1420; i++){
            if(isPrime[i] == 0){
                for(int j = i * i; j <= 2000000; j += i){
                    if(isPrime[j] == 0){
                        isPrime[j] = i;
                    }
                }
            }
        }
        for(int i = 2; i <= 2000000; i++)
            if(isPrime[i] == 0)
                isPrime[i] = i;
        int test = sc.nextInt(), n;
        long sum = 0;
        while(test-- != 0){
            n = sc.nextInt();
            while(n > 1){
                sum += isPrime[n];
                n /= isPrime[n];
            }
        }
        System.out.println(sum);
    }
}