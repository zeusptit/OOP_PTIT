import java.io.*;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double ab = a.distance(b), bc = b.distance(c), ca = c.distance(a);
            if(ab + bc <= ca || bc + ca <= ab || ab + ca <= bc){
                System.out.println("INVALID");
            }else{
                System.out.printf("%.2f\n", Math.sqrt((ab + bc + ca) * (ab + bc - ca) * ( - ab + bc + ca) * ( ab - bc + ca)) / 4);
            }
        }
    }
}