import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            Fraction a = new Fraction(sc.nextLong(), sc.nextLong()), b = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction c = (a.plus(b)).mul(a.plus(b));
            Fraction d = (a.mul(b)).mul(c);
            System.out.println(c + " " + d);
        }
    }
}
/*
KV2B123
Ly Thi Thu Ha
8
6.5
7
 */
