import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(String s) throws IOException {
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            String temp = sc.next().toLowerCase();
            this.set.add(temp);
        }
    }

    public String difference(WordSet another) {
        StringBuilder sb = new StringBuilder();
        for(String x : set){
            if(!another.set.contains(x)){
                sb.append(x).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
