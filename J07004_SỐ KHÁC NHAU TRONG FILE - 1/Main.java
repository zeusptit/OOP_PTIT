
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] intSet = new int[1005];
        while(sc.hasNextInt()){
            intSet[sc.nextInt()]++;
        }
        for(int i = 0; i <= 1000; i++){
            if(intSet[i] > 0){
                System.out.println(i + " " + intSet[i]);
            }
        }
    }
}
/*

 */
