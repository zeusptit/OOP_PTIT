import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static boolean isPrime(int n){
        if(n < 2)return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)return false;
        }
        return true;
    }
    public static boolean isPalinedrome(int n){
        String temp = String.valueOf(n);
        int left = 0, right = temp.length() - 1;
        while(left < right){
            if(temp.charAt(left++) != temp.charAt(right--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list_1 = (ArrayList<Integer>)inputStream1.readObject();
        ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list_2 = (ArrayList<Integer>)inputStream2.readObject();
        TreeSet<Integer> set = new TreeSet<>();
        for(int x : list_1){
            if(isPrime(x) && isPalinedrome(x)){
                set.add(x);
            }
        }
        for(int x : list_2){
            if(isPrime(x) && isPalinedrome(x)){
                set.add(x);
            }
        }
        for(int x : set){
            System.out.println(x + " " + Collections.frequency(list_1, x) + " " + Collections.frequency(list_2, x));
        }
    }
}
/*

 */