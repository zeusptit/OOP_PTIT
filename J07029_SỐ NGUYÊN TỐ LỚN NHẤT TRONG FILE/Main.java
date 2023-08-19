import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n){
        if(n < 2)return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        ArrayList<Integer> list = new ArrayList<>();
        int[] intSet = new int[1000005];
        for(int x : a){
            if(isPrime(x)){
                if(intSet[x] == 0){
                    list.add(x);
                }
                intSet[x]++;
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int i = 0; i < 10; i++){
            System.out.println(list.get(i) + " " + intSet[list.get(i)]);
        }
    }
}
/*

 */
