import test.Pair;

import java.io.*;
import java.util.*;

public class Main {
    public static int gcd(int a, int b){
        if(b == 0)return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) objectInputStream.readObject();
        Collections.sort(list);
        HashSet<String> set = new HashSet<>();
        for(Pair x : list){
            if(x.getFirst() < x.getSecond() && gcd(x.getFirst(), x.getSecond()) == 1 && !set.contains(x.toString())){
                set.add(x.toString());
                System.out.println(x);
            }
        }
    }
}