import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n){
        if(n < 2)return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>)inputStream.readObject();
        int[] intSet = new int[10005];
        for(int i : list){
            if(isPrime(i))
                intSet[i]++;
        }
        for(int i = 2; i <= 10000; i++){
            if(intSet[i] > 0){
                System.out.println(i + " " + intSet[i]);
            }
        }
    }
}
/*

 */
