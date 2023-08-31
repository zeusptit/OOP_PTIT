import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt(), t = s;
        int[] minVal = new int[n], maxVal = new int[n];
        if(s == 0 && n > 0 || n * 9 < s){
            System.out.println("-1 -1");
            return;
        }
        t--;
        for(int i = n - 1; i >= 0; i--){
            if(t >= 9){
                t -= 9;
                minVal[i] = 9;
            }else{
                minVal[i] = t;
                t = 0;
            }
        }
        minVal[0]++;
        for(int i = 0; i < n; i++){
            if(s >= 9){
                s -= 9;
                maxVal[i] = 9;
            }else{
                maxVal[i] = s;
                s = 0;
            }
        }
        for(int x : minVal) System.out.print(x);
        System.out.print(" ");
        for(int x : maxVal) System.out.print(x);
    }
}