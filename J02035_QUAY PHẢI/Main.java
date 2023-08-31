import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++)a[i] = sc.nextInt();
            long min_v = Long.MAX_VALUE;
            int idx = -1;
            for(int i = 0; i < n; i++){
                if(a[i] < min_v){
                    min_v = a[i];
                    idx = i;
                }
            }
            System.out.println(idx);
        }
    }
}
/*

 */