
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        if(s.length() == 1)
            System.out.println(s);
        while(s.length() > 1){
            BigInteger num1 = new BigInteger(s.substring(0,s.length() / 2));
            BigInteger num2 = new BigInteger(s.substring(s.length() / 2));
            s = num1.add(num2).toString();
            System.out.println(s);
        }
    }
}
/*

 */
