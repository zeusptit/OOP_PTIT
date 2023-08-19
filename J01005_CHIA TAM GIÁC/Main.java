import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            double n = sc.nextDouble(), h = sc.nextDouble(), temp = 0;
            for(int i = 1; i < n; i++){
                System.out.printf("%.6f ",h * Math.sqrt((i / n)));
            }
            System.out.println();
        }
    }
}