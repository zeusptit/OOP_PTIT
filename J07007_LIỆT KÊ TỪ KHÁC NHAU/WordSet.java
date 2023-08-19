import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(String s) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(String x : set){
            res.append(x).append("\n");
        }
        return res.toString();
    }
}
