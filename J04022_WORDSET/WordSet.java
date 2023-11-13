import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class WordSet {
    private String input;

    public WordSet(String input) {
        this.input = input.toLowerCase();
    }
    public String union(WordSet another){
        String[] wordSet1 = input.split("\\s+"), wordSet2 = another.input.split("\\s+");
        TreeSet<String> set = new TreeSet<>();
        for(String x : wordSet1)set.add(x);
        for(String x : wordSet2)set.add(x);
        StringBuilder sb = new StringBuilder();
        for(String x : set){
            sb.append(x).append(" ");
        }
        return sb.toString().trim();
    }
    public String intersection(WordSet another){
        String[] wordSet1 = input.split("\\s+"), wordSet2 = another.input.split("\\s+");
        TreeSet<String> set1 = new TreeSet<>(), set2 = new TreeSet<>();
        for(String x : wordSet1)set1.add(x);
        for(String x : wordSet2)set2.add(x);
        StringBuilder sb = new StringBuilder();
        for(String x : set1){
            if(set2.contains(x)){
                sb.append(x).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
