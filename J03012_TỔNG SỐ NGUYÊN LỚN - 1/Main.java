import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            String s = sc.next(), t = sc.next();
            BigInteger a = new BigInteger(s);
            BigInteger b = new BigInteger(t);
            BigInteger ans = a.add(b);
            System.out.println(ans);
        }
    }
}