import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long[] Fibo = new Long[94];
        Fibo[0] = 0L;
        Fibo[1] = 1L;
        for(int i = 2; i < 93; i++){
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
        int test = sc.nextInt();
        while(test-- != 0){
            Long n = sc.nextLong();
            int idx = Arrays.binarySearch(Fibo, 0, 92, n);
            if(idx < 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}