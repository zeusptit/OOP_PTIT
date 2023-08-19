import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) objectInputStream.readObject();
        int[] intSet = new int[1005];
        for(int i : a)
            intSet[i]++;
        for(int i = 0; i <= 1000;i++){
            if(intSet[i] > 0){
                System.out.println(i + " " + intSet[i]);
            }
        }
    }
}
/*

 */