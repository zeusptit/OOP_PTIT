import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            String s = sc.next();
            int k = sc.nextInt();
            Set<Character> set = new HashSet<>();
            for(char x : s.toCharArray()){
                set.add(x);
            }
            if(set.size() + k >= 26)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
/*

 */