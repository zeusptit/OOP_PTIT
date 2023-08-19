import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt();
            System.out.println((long)n * (n + 1)/ 2);
        }
    }
}