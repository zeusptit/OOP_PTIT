import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] a = new int[100], c = new int[100];
        int count = 0;
        Arrays.fill(a, 0);
        Arrays.fill(c, 0);
        for(int i = 0; i < s.length() - 1; i++){
            int j = i + 1;
            if(a[(int)s.charAt(i)] == 0){
                Arrays.fill(c, 0);
                while(s.charAt(i) != s.charAt(j)){
                    if(c[(int)s.charAt(j)] == 0 && a[(int)s.charAt(j)] != 1){
                        count++;
                        c[(int)s.charAt(j)] = 1;
                    }else if(c[(int)s.charAt(j)] == 1 && a[(int)s.charAt(j)] != 1){
                        count--;
                    }
                    j++;
                }
                a[(int) s.charAt(i)] = 1;
            }
        }
        System.out.println(count);
    }
}
/*

 */