import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Long[] Fibo = new Long[93];
    public static void fibo(){
        Fibo[0] = 0L;
        Fibo[1] = 1L;
        for(int i = 2; i <= 92; i++){
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo();
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt();
            System.out.println(Fibo[n]);
        }
    }
}