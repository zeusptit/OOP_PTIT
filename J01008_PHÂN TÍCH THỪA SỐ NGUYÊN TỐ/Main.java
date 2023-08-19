import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1; t <= test; t++){
            int n = sc.nextInt();
            System.out.print("Test " + t + ": ");
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    int temp = 0;
                    while(n % i == 0){
                        n /= i;
                        temp++;
                    }
                    System.out.print(i + "(" + temp + ") ");
                }
            }
            if(n > 1)
                System.out.print(n + "(1)");
            System.out.println();
        }
    }
}