import test.Pair;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) objectInputStream.readObject();
        Collections.sort(list);
        HashSet<String> set = new HashSet<>();
        for(Pair x : list){
            if(x.getFirst() < x.getSecond() && !set.contains(x.toString())){
                set.add(x.toString());
                System.out.println(x);
            }
        }
    }
}