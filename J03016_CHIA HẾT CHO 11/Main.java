import java.io.*;
import java.util.*;

public class Main {
    public static int solve(String s){
        int oddSum = 0, evenSum = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0)
                oddSum += s.charAt(i) - '0';
            else
                evenSum += s.charAt(i) - '0';
        }
        if((oddSum - evenSum) % 11 == 0)return 1;
        return 0;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
}