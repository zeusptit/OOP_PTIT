
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String str = sc.next();
            try {
                sum += Integer.parseInt(str);
            } catch (Exception e) {
            }
        }
        System.out.println(sum);
    }
}
/*

 */
