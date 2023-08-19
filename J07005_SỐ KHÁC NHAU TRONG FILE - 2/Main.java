import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] intSet = new int[1005];
        for(int i = 0; i < 100000; i++)
            intSet[sc.readInt()]++;
        for(int i = 0; i <= 1000;i++){
            if(intSet[i] > 0){
                System.out.println(i + " " + intSet[i]);
            }
        }
    }
}
/*

 */